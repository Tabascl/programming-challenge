package de.exxcellent.challenge.data;

import com.opencsv.bean.CsvBindByName;

import static java.lang.Math.abs;

public class Football implements Entry {
    @CsvBindByName(column = "Team")
    private String team;

    @CsvBindByName(column = "Goals")
    private int goals;

    @CsvBindByName(column = "Goals Allowed")
    private int goalsAllowed;

    public String getTeam() {
        return team;
    }

    @Override
    public int getMaximum() {
        return goalsAllowed;
    }

    @Override
    public int getMinimum() {
        return goals;
    }

    @Override
    public int getDistance() {
        return abs(goals - goalsAllowed);
    }
}
