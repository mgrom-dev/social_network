package com.diplom.social_network.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tag2post")
public class Tag2Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // id связи
    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post; // пост
    @ManyToOne
    @JoinColumn(name = "tag_id", nullable = false)
    private Tag tag; // тэг

    @Override
    public String toString() {
        return "Tag to post" +
                "id=" + id +
                ", post id='" + post.getId() + '\'' +
                ", tag id='" + tag.getId() + '\'' +
                '}';
    }
}
