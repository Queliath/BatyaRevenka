package by.riomedia.batya.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "br_service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "icon_url")
    private String iconUrl;
    @Column(name = "short_description")
    private String shortDescription;

    @OneToMany(mappedBy = "service")
    private Set<ServiceAdvantage> advantages;
    @OneToMany(mappedBy = "service")
    private Set<ServiceExample> examples;
    @OneToMany(mappedBy = "service")
    private Set<ServiceType> types;
    @OneToMany(mappedBy = "service")
    private Set<ServicePriceColumn> priceColumns;

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

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Service service = (Service) o;

        return id != null ? id.equals(service.id) : service.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
