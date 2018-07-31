package de.exxcellent.challenge.data;

import com.opencsv.bean.CsvBindByName;

/**
 * An implementation of {@code Entry} specific to data of 'weather' type.
 */
public class Weather implements Entry {
    @CsvBindByName(column = "Day")
    private int day;

    @CsvBindByName(column = "MxT")
    private int maxTemp;

    @CsvBindByName(column = "MnT")
    private int minTemp;

    /**
     * Get the day.
     * @return the day
     */
    public int GetDay() {
        return day;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int GetMaximum() {
        return maxTemp;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int GetMinimum() {
        return minTemp;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int GetDistance() {
        return maxTemp - minTemp;
    }
}
