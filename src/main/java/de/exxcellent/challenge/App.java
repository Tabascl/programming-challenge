package de.exxcellent.challenge;

import de.exxcellent.challenge.data.EntryContainer;
import de.exxcellent.challenge.data.Football;
import de.exxcellent.challenge.data.Weather;
import de.exxcellent.challenge.writer.ConsoleWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Parse: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    public static void main(String... args) {
        var pathWeather = "src/main/resources/de/exxcellent/challenge/weather.csv";
        var pathFootball = "src/main/resources/de/exxcellent/challenge/football.csv";

        FileReader readerWeather = null;
        FileReader readerFootball = null;
        try {
            readerWeather = new FileReader(pathWeather);
            readerFootball = new FileReader(pathFootball);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }

        EntryContainer<Weather> weatherContainer = new EntryContainer<>(readerWeather, Weather.class);
        EntryContainer<Football> footballContainer = new EntryContainer<>(readerFootball, Football.class);

        var smallestWeather = weatherContainer.GetSmallestDistanceEntry();
        var smallestFootball = footballContainer.GetSmallestDistanceEntry();

        ConsoleWriter writer = new ConsoleWriter();
        writer.Write(String.format("Day with smallest temperature spread : %s%n", smallestWeather.GetDay()));
        writer.Write(String.format("Team with smallest goal spread       : %s%n", smallestFootball.GetTeam()));
    }
}
