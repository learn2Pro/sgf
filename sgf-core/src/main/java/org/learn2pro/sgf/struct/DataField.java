package org.learn2pro.sgf.struct;

import com.google.common.base.Preconditions;
import org.learn2pro.sgf.Jsonization;

import java.util.regex.Pattern;

/**
 * column definition in schema
 * contains name {@link String} and type {@link DataType}
 */
public class DataField implements Jsonization {
    private static final Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]+$");
    /**
     * the field name
     */
    private String name;
    /**
     * the field type
     */
    private DataType type;

    public DataField(final String name, final DataType type) {
        Preconditions.checkArgument(pattern.matcher(name).matches(), "name pattern must in [a-zA-Z0-9_]!");
        this.name = name;
        this.type = type;
    }

    /**
     * get the name
     */
    public String getName() {
        return name;
    }

    /**
     * get the type
     */
    public DataType getType() {
        return type;
    }

    @Override
    public String toJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"name\": ");
        sb.append(this.name);
        sb.append(" ,type: ");
        sb.append(this.type);
        sb.append("}");
        return sb.toString();
    }
}
