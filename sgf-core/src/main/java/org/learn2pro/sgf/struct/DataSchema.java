package org.learn2pro.sgf.struct;

import com.google.common.base.Joiner;
import org.learn2pro.sgf.Jsonization;

import java.util.List;

/**
 * the row data schema
 */
public class DataSchema implements Jsonization {
    /**
     * data types
     */
    private List<DataField> fields;

    /**
     * the schema definition
     */
    public DataSchema(final List<DataField> fields) {
        this.fields = fields;
    }

    @Override
    public String toJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        sb.append(Joiner.on(",\n").join(fields));
        sb.append("\n]");
        return sb.toString();
    }
}
