package by.riomedia.batya.dao.impl;

import by.riomedia.batya.dao.ServicePriceColumnDAO;
import by.riomedia.batya.entity.ServicePriceColumn;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ServicePriceColumnDAOImpl implements ServicePriceColumnDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ServicePriceColumn> getColumns(Long serviceId) {
        TypedQuery<ServicePriceColumn> query = entityManager.createQuery(
                "select spc from ServicePriceColumn spc where spc.service.id = :serviceId order by spc.orderNumber", ServicePriceColumn.class);
        return query.setParameter("serviceId", serviceId).getResultList();
    }
}
