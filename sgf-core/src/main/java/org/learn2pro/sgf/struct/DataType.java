package org.learn2pro.sgf.struct;

/**
 * schema types
 */
public enum DataType {
    /**
     * long type
     */
    LONG,
    /**
     * double type
     */
    DOUBLE,
    /**
     * bytes type
     */
    BYTES,
    /**
     * timestamp type
     */
    TIMESTAMP,
    /**
     * integer type
     */
    INTEGER,
    /**
     * struct type
     */
    STRUCT,
    /**
     * list type
     */
    LIST,
    /**
     * map type
     */
    MAP;

    DataType() {
    }
}
