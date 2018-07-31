package de.exxcellent.challenge.writer;

public class ConsoleWriter implements GenericWriter {
    @Override
    public void Write(String text) {
        System.out.print(text);
    }
}
