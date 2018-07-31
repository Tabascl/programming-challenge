package de.exxcellent.challenge.data;

import com.opencsv.bean.CsvBindByName;

import static java.lang.Math.abs;

/**
 * An implementation of {@code Entry} specific to data of 'football' type.
 */
public class Football implements Entry {
    @CsvBindByName(column = "Team")
    private String team;

    @CsvBindByName(column = "Goals")
    private int goals;

    @CsvBindByName(column = "Goals Allowed")
    private int goalsAllowed;

    /**
     * Get the teams name.
     * @return the teams name
     */
    public String GetTeam() {
        return team;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int GetMaximum() {
        return goalsAllowed;
    }

    /**
     * @{inheritDoc}
     */
    @Override
    public int GetMinimum() {
        return goals;
    }

    /**
     * Calculate the absolute distance between goals scored and goals allowed.
     * @return the absolute distance between goals scored and goals allowed
     */
    @Override
    public int GetDistance() {
        return abs(goals - goalsAllowed);
    }
}
