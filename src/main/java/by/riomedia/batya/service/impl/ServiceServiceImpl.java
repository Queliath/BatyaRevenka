package by.riomedia.batya.service.impl;

import by.riomedia.batya.dao.ServiceDAO;
import by.riomedia.batya.entity.Service;
import by.riomedia.batya.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Service
@Transactional
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    private ServiceDAO serviceDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Service> getServices() {
        return serviceDAO.getServices();
    }

    @Override
    public Service getService(Long id) {
        return serviceDAO.getService(id);
    }
}
