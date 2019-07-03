package br.com.higor.graphqlhibernate.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "post_id")
    private Long postId;
    private String username;
    private String comment;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}