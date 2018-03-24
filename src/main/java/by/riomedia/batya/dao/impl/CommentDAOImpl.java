package by.riomedia.batya.dao.impl;

import by.riomedia.batya.dao.CommentDAO;
import by.riomedia.batya.entity.Comment;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CommentDAOImpl implements CommentDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Comment> getComments() {
        TypedQuery<Comment> query = entityManager.createQuery(
                "select c from Comment c", Comment.class);
        return query.getResultList();
    }
}
