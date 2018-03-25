package by.riomedia.batya.vo;

import by.riomedia.batya.entity.ServicePriceColumn;

import java.util.List;
import java.util.Map;

public class ServicePriceTableVO {

    private List<ServicePriceColumn> columns;
    private List<Map<String, String>> rows;

    public List<ServicePriceColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<ServicePriceColumn> columns) {
        this.columns = columns;
    }

    public List<Map<String, String>> getRows() {
        return rows;
    }

    public void setRows(List<Map<String, String>> rows) {
        this.rows = rows;
    }
}
