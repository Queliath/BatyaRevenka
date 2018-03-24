package by.riomedia.batya.service.impl;

import by.riomedia.batya.dao.CommentDAO;
import by.riomedia.batya.entity.Comment;
import by.riomedia.batya.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDAO commentDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Comment> getComments() {
        return commentDAO.getComments();
    }
}
