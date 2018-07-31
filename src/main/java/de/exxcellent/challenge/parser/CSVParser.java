package de.exxcellent.challenge.parser;

import com.opencsv.bean.CsvToBeanBuilder;
import de.exxcellent.challenge.data.Entry;

import java.io.Reader;
import java.util.List;

public class CSVParser<T extends Entry> implements GenericParser {
    private Reader reader;
    private Class<T> type;

    public CSVParser(Reader reader, Class<T> type) {
        this.reader = reader;
        this.type = type;
    }
    @Override
    public List<T> Parse() {
        return new CsvToBeanBuilder(reader).withType(type).build().parse();
    }
}
