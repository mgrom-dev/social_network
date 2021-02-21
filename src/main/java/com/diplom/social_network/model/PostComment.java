package com.diplom.social_network.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "post_comments")
public class PostComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // id комментария
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private PostComment parent; // комментарий, на который оставлен этот комментарий (может быть NULL, если комментарий оставлен просто к посту)
    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post; // пост, к которому написан комментарий
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // автор комментария
    private LocalDateTime time; // дата и время комментария
    private String text; // текст комментария

    @Override
    public String toString() {
        return "Comment to post" +
                "id=" + id +
                ", post id='" + post.getId() + '\'' +
                ", user id='" + user.getId() + '\'' +
                ", time='" + time + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
