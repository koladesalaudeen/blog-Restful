package com.blogapp.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Likes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private Long userId;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

}
