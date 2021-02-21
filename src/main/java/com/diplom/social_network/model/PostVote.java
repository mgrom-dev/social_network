package com.diplom.social_network.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "post_votes")
public class PostVote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // id лайка/дизлайка
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // тот, кто поставил лайк / дизлайк
    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post; // пост, которому поставлен лайк / дизлайк
    private LocalDateTime time; // дата и время лайка / дизлайка
    private int value; // лайк или дизлайк: 1 или -1

    @Override
    public String toString() {
        return "Post votes" +
                "id=" + id +
                ", user id='" + user.getId() + '\'' +
                ", post id ='" + post.getId() + '\'' +
                ", value ='" + value + '\'' +
                '}';
    }
}
