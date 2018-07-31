package de.exxcellent.challenge.data;

import de.exxcellent.challenge.parser.CSVParser;

import java.io.Reader;
import java.util.List;

/**
 * A container for objects of type {@code Entry}.
 * Provides methods that work on multiple of these objects.
 *
 * @param <T> the type of entries in this container
 */
public class EntryContainer<T extends Entry> {
    private List<T> entries;

    /**
     * Initialize the container using a list of entries
     * @param entries is a list containing entries
     */
    public EntryContainer(List<T> entries) {
        this.entries = entries;
    }

    /**
     * Initialize the container using a CSVReader
     * @param reader is any type of {@code Reader}
     * @param type is the type of {@code Entry}
     */
    public EntryContainer(Reader reader, Class<T> type) {
        this.entries = new CSVParser<>(reader, type).Parse();
    }

    /**
     * Calculate the entry with the smallest distance.
     *
     * @return the entry with the smallest distance
     */
    public T GetSmallestDistanceEntry() {
        var smallestIndex = 0;
        for (var i = 0; i < entries.size(); i++) {
            if (entries.get(i).GetDistance() < entries.get(smallestIndex).GetDistance()) smallestIndex = i;
        }
        return entries.get(smallestIndex);
    }
}
