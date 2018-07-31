package de.exxcellent.challenge.parser;

import de.exxcellent.challenge.data.Entry;

import java.util.List;

public interface GenericParser<T extends Entry> {
    public List<T> Read();
}
