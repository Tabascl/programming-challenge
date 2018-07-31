package de.exxcellent.challenge.data;

import com.opencsv.bean.CsvBindByName;

public class CSVFootball implements CSVEntry {
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
        return goalsAllowed - goals;
    }
}
