package by.riomedia.batya.converter;

import by.riomedia.batya.dto.CommentDTO;
import by.riomedia.batya.entity.Comment;

public interface CommentConverter {
    CommentDTO convertToDTO(Comment comment);
}
