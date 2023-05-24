package com.blogapp.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Comment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private Long userId;
    private String comment;
    private LocalDateTime commentedAt;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
