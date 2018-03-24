package by.riomedia.batya.dao;

import by.riomedia.batya.entity.Service;

import java.util.List;

public interface ServiceDAO {
    List<Service> getServices();
    Service getService(Long id);
}
