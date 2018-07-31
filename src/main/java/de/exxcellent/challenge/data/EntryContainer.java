package de.exxcellent.challenge.data;

import java.util.List;

public class EntryContainer<T extends Entry> {
    private List<T> entries;

    public EntryContainer(List<T> entries) {
        this.entries = entries;
    }

    public int GetSmallestDistance() {
        int smallestIndex = 0;
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getDistance() < entries.get(smallestIndex).getDistance()) smallestIndex = i;
        }
        return smallestIndex;
    }
}
