package by.riomedia.batya.dao.impl;

import by.riomedia.batya.dao.ServiceDAO;
import by.riomedia.batya.entity.Service;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ServiceDAOImpl implements ServiceDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Service> getServices() {
        TypedQuery<Service> query = entityManager.createQuery(
                "select s from Service s", Service.class);
        return query.getResultList();
    }

    @Override
    public Service getService(Long id) {
        return entityManager.find(Service.class, id);
    }
}
