package org.learn2pro.sgf.format;

/**
 * the statistic in block file, available for all types
 * contains min/max/nullCount/count etc.
 */
public interface ColumnStatistic {
    /**
     * Get the number of values in this column. It will differ from the number
     * of rows because of NULL values and repeated values.
     *
     * @return the number of values
     */
    long getNumberOfValues();

    /**
     * Returns true if there are nulls in the scope of column statistics.
     *
     * @return true if null present else false
     */
    boolean hasNull();

    /**
     * Get the number of bytes for this column.
     *
     * @return the number of bytes
     */
    long getBytesOnDisk();
}
