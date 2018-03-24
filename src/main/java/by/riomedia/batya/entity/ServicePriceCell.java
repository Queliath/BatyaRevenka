package by.riomedia.batya.entity;

import javax.persistence.*;

@Entity
@Table(name = "br_service_price_cell")
public class ServicePriceCell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "line_number")
    private Integer lineNumber;
    @Column(name = "cell_value")
    private String cellValue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_column_id")
    private ServicePriceColumn priceColumn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getCellValue() {
        return cellValue;
    }

    public void setCellValue(String cellValue) {
        this.cellValue = cellValue;
    }

    public ServicePriceColumn getPriceColumn() {
        return priceColumn;
    }

    public void setPriceColumn(ServicePriceColumn priceColumn) {
        this.priceColumn = priceColumn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServicePriceCell servicePriceCell = (ServicePriceCell) o;

        return id != null ? id.equals(servicePriceCell.id) : servicePriceCell.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
