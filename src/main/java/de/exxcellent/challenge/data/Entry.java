package de.exxcellent.challenge.data;

/**
 * This interface ensures that all implementing classes provide methods for calculating the distance between two values
 * depending on the specific type of entry.
 */
public interface Entry {
    /**
     * Get the maximum value.
     * @return the maximum value
     */
    int GetMaximum();

    /**
     * Get the minimum value.
     * @return the minimum value
     */
    int GetMinimum();

    /**
     * Get the distance between the maximum and minimum values.
     * @return the distance between the maximum and minimum values
     */
    int GetDistance();
}
