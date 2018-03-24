package by.riomedia.batya.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "br_service_price_column")
public class ServicePriceColumn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_id")
    private Service service;
    @OneToMany(mappedBy = "priceColumn")
    private Set<ServicePriceCell> cells;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServicePriceColumn servicePriceColumn = (ServicePriceColumn) o;

        return id != null ? id.equals(servicePriceColumn.id) : servicePriceColumn.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
