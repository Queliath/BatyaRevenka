package by.riomedia.batya.dao;

import by.riomedia.batya.entity.ServiceExample;

import java.util.List;

public interface ServiceExampleDAO {
    List<ServiceExample> getExamples(Long serviceId);
}
