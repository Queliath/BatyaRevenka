package by.riomedia.batya.dao.impl;

import by.riomedia.batya.dao.ServiceTypeDAO;
import by.riomedia.batya.entity.ServiceType;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ServiceTypeDAOImpl implements ServiceTypeDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ServiceType> getTypes(Long serviceId) {
        TypedQuery<ServiceType> query = entityManager.createQuery(
                "select st from ServiceType st where st.service.id = :serviceId", ServiceType.class);
        return query.setParameter("serviceId", serviceId).getResultList();
    }

}
