package de.exxcellent.challenge;

import com.opencsv.bean.CsvToBeanBuilder;
import de.exxcellent.challenge.data.CSVEntry;
import de.exxcellent.challenge.data.CSVFootball;
import de.exxcellent.challenge.data.CSVWeather;

import java.io.FileReader;
import java.util.List;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    public static void main(String... args) throws Exception {
        String pathWeather = "src/main/resources/de/exxcellent/challenge/weather.csv";
        String pathFootball = "src/main/resources/de/exxcellent/challenge/football.csv";

        FileReader readerWeather = new FileReader(pathWeather);
        FileReader readerFootball = new FileReader(pathFootball);

        List<CSVWeather> resultWeather = new CsvToBeanBuilder(readerWeather).withType(CSVWeather.class).build().parse();
        List<CSVFootball> resultFootball = new CsvToBeanBuilder(readerFootball).withType(CSVFootball.class).build().parse();

        int minWeather = getSmallestIndex(resultWeather);
        int minFootball = getSmallestIndex(resultFootball);

        String dayWithSmallestTempSpread = Integer.toString(resultWeather.get(minWeather).getDay());
        String teamWithSmallestGoalSpread = resultFootball.get(minFootball).getTeam();

        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }

    private static <T extends CSVEntry> int getSmallestIndex(List<T> result) {
        int smallestIndex = 0;
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).getDistance() < result.get(smallestIndex).getDistance()) smallestIndex = i;
        }
        return smallestIndex;
    }
}
