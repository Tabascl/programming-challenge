package de.exxcellent.challenge.Reader;

import com.opencsv.bean.CsvToBeanBuilder;
import de.exxcellent.challenge.data.Entry;

import java.io.Reader;
import java.util.List;

public class CSVReader<T extends Entry> implements GenericReader {
    private Reader reader;
    private Class<T> type;

    public CSVReader(Reader reader, Class<T> type) {
        this.reader = reader;
        this.type = type;
    }
    @Override
    public List<T> Read() {
        return new CsvToBeanBuilder(reader).withType(type).build().parse();
    }
}
