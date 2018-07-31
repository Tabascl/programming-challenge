package de.exxcellent.challenge.data;

import com.opencsv.bean.CsvBindByName;

public class Weather implements Entry {
    @CsvBindByName(column = "Day")
    private int day;

    @CsvBindByName(column = "MxT")
    private int maxTemp;

    @CsvBindByName(column = "MnT")
    private int minTemp;

    public int getDay() {
        return day;
    }

    @Override
    public int getMaximum() {
        return maxTemp;
    }

    @Override
    public int getMinimum() {
        return minTemp;
    }

    @Override
    public int getDistance() {
        return maxTemp - minTemp;
    }
}
