package by.riomedia.batya.converter.impl;

import by.riomedia.batya.converter.CommentConverter;
import by.riomedia.batya.dto.CommentDTO;
import by.riomedia.batya.entity.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentConverterImpl implements CommentConverter {

    @Override
    public CommentDTO convertToDTO(Comment comment) {
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setId(comment.getId());
        commentDTO.setAuthorName(comment.getAuthorName());
        commentDTO.setContent(comment.getContent());
        commentDTO.setDateCreated(comment.getDateCreated());
        return commentDTO;
    }

}
