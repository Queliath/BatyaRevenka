package by.riomedia.batya.service.impl;

import by.riomedia.batya.dao.ServiceAdvantageDAO;
import by.riomedia.batya.entity.ServiceAdvantage;
import by.riomedia.batya.service.ServiceAdvantageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServiceAdvantageServiceImpl implements ServiceAdvantageService {

    @Autowired
    private ServiceAdvantageDAO serviceAdvantageDAO;

    @Override
    @Transactional(readOnly = true)
    public List<ServiceAdvantage> getAdvantages(Long serviceId) {
        return serviceAdvantageDAO.getAdvantages(serviceId);
    }

}
