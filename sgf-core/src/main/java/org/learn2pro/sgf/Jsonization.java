package org.learn2pro.sgf;

import java.io.Serializable;

/**
 * object could parsed to json
 */
public interface Jsonization extends Serializable {

    /**
     * to json string
     */
    String toJson();
}
