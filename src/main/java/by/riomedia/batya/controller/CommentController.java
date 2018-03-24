package by.riomedia.batya.controller;

import by.riomedia.batya.converter.CommentConverter;
import by.riomedia.batya.dto.CommentDTO;
import by.riomedia.batya.entity.Comment;
import by.riomedia.batya.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;
    @Autowired
    private CommentConverter commentConverter;

    @GetMapping
    public ResponseEntity<List<CommentDTO>> getComments() {
        List<Comment> comments = commentService.getComments();
        List<CommentDTO> commentDTOs = new ArrayList<>(comments.size());
        for (Comment comment : comments) {
            commentDTOs.add(commentConverter.convertToDTO(comment));
        }
        return ResponseEntity.ok(commentDTOs);
    }
}

