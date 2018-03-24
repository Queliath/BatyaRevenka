package by.riomedia.batya.service;

import by.riomedia.batya.entity.ServiceType;

import java.util.List;

public interface ServiceTypeService {
    List<ServiceType> getTypes(Long serviceId);
}
