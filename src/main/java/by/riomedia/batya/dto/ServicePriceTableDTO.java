package by.riomedia.batya.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServicePriceTableDTO {

    private List<Column> columns;
    private List<Map<String, String>> rows;

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public void addColumn(Long id, String label, String attributeName) {
        if (columns == null) {
            columns = new ArrayList<>();
        }
        columns.add(new Column(id, label, attributeName));
    }

    public List<Map<String, String>> getRows() {
        return rows;
    }

    public void setRows(List<Map<String, String>> rows) {
        this.rows = rows;
    }

    public class Column {
        private Long id;
        private String label;
        private String attributeName;

        public Column() {
        }

        public Column(Long id, String label, String attributeName) {
            this.id = id;
            this.label = label;
            this.attributeName = attributeName;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getAttributeName() {
            return attributeName;
        }

        public void setAttributeName(String attributeName) {
            this.attributeName = attributeName;
        }
    }
}
