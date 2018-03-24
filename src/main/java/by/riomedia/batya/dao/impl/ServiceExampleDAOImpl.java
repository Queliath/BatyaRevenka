package by.riomedia.batya.dao.impl;

import by.riomedia.batya.dao.ServiceExampleDAO;
import by.riomedia.batya.entity.ServiceExample;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ServiceExampleDAOImpl implements ServiceExampleDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ServiceExample> getExamples(Long serviceId) {
        TypedQuery<ServiceExample> query = entityManager.createQuery(
                "select se from ServiceExample se where se.service.id = :serviceId", ServiceExample.class);
        return query.setParameter("serviceId", serviceId).getResultList();
    }

}
