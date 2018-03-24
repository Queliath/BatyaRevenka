package by.riomedia.batya.dao.impl;

import by.riomedia.batya.dao.BasicInfoDAO;
import by.riomedia.batya.entity.BasicInfo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class BasicInfoDAOImpl implements BasicInfoDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<BasicInfo> getBasicInfoList() {
        TypedQuery<BasicInfo> query = entityManager.createQuery(
                "select bi from BasicInfo bi", BasicInfo.class);
        return query.getResultList();
    }
}
