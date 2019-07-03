package br.com.higor.graphqlhibernate.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    @OneToMany
    @JoinColumn(name = "post_id")
    private List<Comment> comments;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
