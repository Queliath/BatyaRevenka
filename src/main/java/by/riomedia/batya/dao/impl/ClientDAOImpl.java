package by.riomedia.batya.dao.impl;

import by.riomedia.batya.dao.ClientDAO;
import by.riomedia.batya.entity.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ClientDAOImpl implements ClientDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Client> getClients() {
        TypedQuery<Client> query = entityManager.createQuery(
                "select c from Client c", Client.class);
        return query.getResultList();
    }

}
