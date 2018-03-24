package by.riomedia.batya.service;

import by.riomedia.batya.entity.Service;

import java.util.List;

public interface ServiceService {
    List<Service> getServices();
    Service getService(Long id);
}
