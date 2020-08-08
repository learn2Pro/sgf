package org.learn2pro.sgf.io;

import org.learn2pro.sgf.format.ColumnStatistic;
import org.learn2pro.sgf.struct.Struct;

import java.io.Closeable;
import java.nio.file.Path;

/**
 * the writer in sgf
 */
public interface Writer extends Closeable {
    /**
     * the target write file
     */
    Path targetFile();

    /**
     * the schema writer work on
     *
     * @return
     */
    Struct schema();

    /**
     * the statistic info, that already write
     * @return statistic, each slice represent one column
     */
    ColumnStatistic[] getCurrentStats();

}
