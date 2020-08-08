package org.learn2pro.sgf.struct;

import com.google.common.base.Joiner;
import org.learn2pro.sgf.Jsonization;

import java.util.List;

/**
 * the graph schema definition
 * contains two part: {@link EdgeStruct} vertex and {@link  VertexStruct} edge
 */
public class GraphSchema implements Jsonization {
    /**
     * vertex definitions
     */
    private final List<VertexStruct> vertexes;
    /**
     * edge definitions
     */
    private final List<EdgeStruct> edges;

    public GraphSchema(final List<VertexStruct> vertexes, final List<EdgeStruct> edges) {
        this.vertexes = vertexes;
        this.edges = edges;
    }

    @Override
    public String toJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n\"vertexes\": [");
        sb.append(Joiner.on(",\n").join(vertexes));
        sb.append("\n]");
        sb.append("{\n\"edges\": ");
        sb.append(Joiner.on(",\n").join(edges));
        sb.append("\n]");
        return sb.toString();
    }

    public static class EdgeStruct implements Struct {
        /**
         * src field type
         */
        private final String srcType;
        /**
         * dst field type
         */
        private final String dstType;
        /**
         * the edge type
         */
        private final String edgeType;
        /**
         * the edge verison
         */
        private final String versionField;
        /**
         * the data schema
         */
        private final DataSchema props;

        public EdgeStruct(final String srcType, final String dstType, final String edgeType, final String versionField,
                          final DataSchema props) {
            this.srcType = srcType;
            this.dstType = dstType;
            this.edgeType = edgeType;
            this.versionField = versionField;
            this.props = props;
        }

        @Override
        public String toJson() {
            StringBuilder sb = new StringBuilder();
            sb.append("{\n\"srcType\": ");
            sb.append(this.srcType);
            sb.append("{, \n\"dstType\": ");
            sb.append(this.dstType);
            sb.append("{, \n\"edgeType\": ");
            sb.append(this.edgeType);
            sb.append("{, \n\"versionField\": ");
            sb.append(this.versionField);
            sb.append(", \n\"props\": ");
            sb.append(this.props.toJson());
            sb.append("\n}");
            return sb.toString();
        }
    }

    public static class VertexStruct implements Struct {
        /**
         * vertex type
         */
        private final String vertexType;
        /**
         * the version of vertex
         */
        private final String versionField;
        /**
         * properties schema
         */
        private final DataSchema props;

        public VertexStruct(final String vertexType, final String versionField, final DataSchema props) {
            this.vertexType = vertexType;
            this.versionField = versionField;
            this.props = props;
        }

        @Override
        public String toJson() {
            StringBuilder sb = new StringBuilder();
            sb.append("{\n\"vertexType\": ");
            sb.append(this.vertexType);
            sb.append("{, \n\"versionField\": ");
            sb.append(this.versionField);
            sb.append(", \n\"props\": ");
            sb.append(this.props.toJson());
            sb.append("\n}");
            return sb.toString();
        }
    }
}
