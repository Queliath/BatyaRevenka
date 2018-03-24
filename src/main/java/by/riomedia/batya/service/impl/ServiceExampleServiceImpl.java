package by.riomedia.batya.service.impl;

import by.riomedia.batya.dao.ServiceExampleDAO;
import by.riomedia.batya.entity.ServiceExample;
import by.riomedia.batya.service.ServiceExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServiceExampleServiceImpl implements ServiceExampleService {

    @Autowired
    private ServiceExampleDAO serviceExampleDAO;

    @Override
    @Transactional(readOnly = true)
    public List<ServiceExample> getExamples(Long serviceId) {
        return serviceExampleDAO.getExamples(serviceId);
    }
}
