package by.riomedia.batya.dao;

import by.riomedia.batya.entity.ServiceType;

import java.util.List;

public interface ServiceTypeDAO {
    List<ServiceType> getTypes(Long serviceId);
}
