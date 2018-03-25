package by.riomedia.batya.dao.impl;

import by.riomedia.batya.dao.ServicePriceCellDAO;
import by.riomedia.batya.entity.ServicePriceCell;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ServicePriceCellDAOImpl implements ServicePriceCellDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ServicePriceCell> getCells(Long columnId) {
        TypedQuery<ServicePriceCell> query = entityManager.createQuery(
                "select spc from ServicePriceCell spc where spc.priceColumn.id = :columnId order by spc.lineNumber", ServicePriceCell.class);
        return query.setParameter("columnId", columnId).getResultList();
    }
}
