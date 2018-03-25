package by.riomedia.batya.dao;

import by.riomedia.batya.entity.ServicePriceColumn;

import java.util.List;

public interface ServicePriceColumnDAO {
    List<ServicePriceColumn> getColumns(Long serviceId);
}
