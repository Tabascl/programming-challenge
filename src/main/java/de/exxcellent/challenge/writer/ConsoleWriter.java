package de.exxcellent.challenge.writer;

/**
 * Write the given string to {@code System.out}
 */
public class ConsoleWriter implements GenericWriter {
    /**
     * {@inheritDoc}
     *
     * @param text to write
     */
    @Override
    public void Write(String text) {
        System.out.print(text);
    }
}
