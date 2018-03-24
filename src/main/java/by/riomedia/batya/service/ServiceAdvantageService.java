package by.riomedia.batya.service;

import by.riomedia.batya.entity.ServiceAdvantage;

import java.util.List;

public interface ServiceAdvantageService {
    List<ServiceAdvantage> getAdvantages(Long serviceId);
}
