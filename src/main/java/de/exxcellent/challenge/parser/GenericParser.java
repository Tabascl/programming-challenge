package de.exxcellent.challenge.parser;

import de.exxcellent.challenge.data.Entry;

import java.util.List;

/**
 * A parser for objects that implement the {@code Entry} interface.
 *
 * @param <T> the type of entry to parse to
 */
public interface GenericParser<T extends Entry> {
    /**
     * Parse data to the specified entry type.
     *
     * @return a list of parsed entries
     */
    List<T> Parse();
}
