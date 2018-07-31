package de.exxcellent.challenge.reader;

import de.exxcellent.challenge.data.Entry;

import java.util.List;

public interface GenericReader<T extends Entry> {
    public List<T> Read();
}
