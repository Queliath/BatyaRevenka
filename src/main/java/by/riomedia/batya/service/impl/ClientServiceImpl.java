package by.riomedia.batya.service.impl;

import by.riomedia.batya.dao.ClientDAO;
import by.riomedia.batya.entity.Client;
import by.riomedia.batya.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDAO clientDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Client> getClients() {
        return clientDAO.getClients();
    }

}
