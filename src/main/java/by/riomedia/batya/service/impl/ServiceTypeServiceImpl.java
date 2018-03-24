package by.riomedia.batya.service.impl;

import by.riomedia.batya.dao.ServiceTypeDAO;
import by.riomedia.batya.entity.ServiceType;
import by.riomedia.batya.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServiceTypeServiceImpl implements ServiceTypeService {

    @Autowired
    private ServiceTypeDAO serviceTypeDAO;

    @Override
    @Transactional(readOnly = true)
    public List<ServiceType> getTypes(Long serviceId) {
        return serviceTypeDAO.getTypes(serviceId);
    }
}
