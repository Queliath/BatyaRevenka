package by.riomedia.batya.dao.impl;

import by.riomedia.batya.dao.ServiceAdvantageDAO;
import by.riomedia.batya.entity.ServiceAdvantage;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ServiceAdvantageDAOImpl implements ServiceAdvantageDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ServiceAdvantage> getAdvantages(Long serviceId) {
        TypedQuery<ServiceAdvantage> query = entityManager.createQuery(
                "select sa from ServiceAdvantage sa where sa.service.id = :serviceId", ServiceAdvantage.class);
        return query.setParameter("serviceId", serviceId).getResultList();
    }

}
