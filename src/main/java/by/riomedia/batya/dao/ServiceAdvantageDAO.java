package by.riomedia.batya.dao;

import by.riomedia.batya.entity.ServiceAdvantage;

import java.util.List;

public interface ServiceAdvantageDAO {
    List<ServiceAdvantage> getAdvantages(Long serviceId);
}
