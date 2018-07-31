package de.exxcellent.challenge.data;

import java.util.List;

/**
 * A container for objects of type {@code Entry}.
 * Provides methods that work on multiple of these objects.
 *
 * @param <T> the type of entries in this container
 */
public class EntryContainer<T extends Entry> {
    private List<T> entries;

    public EntryContainer(List<T> entries) {
        this.entries = entries;
    }

    /**
     * Calculate the entry with the smallest distance.
     *
     * @return the entry with the smallest distance
     */
    public T GetSmallestDistanceEntry() {
        int smallestIndex = 0;
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).GetDistance() < entries.get(smallestIndex).GetDistance()) smallestIndex = i;
        }
        return entries.get(smallestIndex);
    }
}
