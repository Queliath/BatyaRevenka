package by.riomedia.batya.service;

import by.riomedia.batya.entity.ServiceExample;

import java.util.List;

public interface ServiceExampleService {
    List<ServiceExample> getExamples(Long serviceId);
}
