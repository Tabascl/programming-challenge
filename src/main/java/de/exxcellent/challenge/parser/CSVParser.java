package de.exxcellent.challenge.parser;

import com.opencsv.bean.CsvToBeanBuilder;
import de.exxcellent.challenge.data.Entry;

import java.io.Reader;
import java.util.List;

/**
 * A parser for csv files.
 * @param <T> the type of entry to parse to
 */
public class CSVParser<T extends Entry> implements GenericParser {
    private Reader reader;
    private Class<T> type;

    /**
     * Construct a parser for csv files.
     * @param reader shall provide csv-formatted data
     * @param type shall determine the entry type
     */
    public CSVParser(Reader reader, Class<T> type) {
        this.reader = reader;
        this.type = type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<T> Parse() {
        return new CsvToBeanBuilder(reader).withType(type).build().parse();
    }
}
