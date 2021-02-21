package com.diplom.social_network.model;

import com.diplom.social_network.model.enums.ModerationStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // id поста
    @Column(name = "is_active")
    private int isActive; // скрыта или активна публикация: 0 или 1
    @Column(name = "moderation_status")
    private ModerationStatus moderationStatus; // статус модерации, по умолчанию значение "NEW"
    @ManyToOne
    @JoinColumn(name = "moderator_id")
    private User moderator; // пользователь - модератор, принявшего решение, или NULL
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // автор поста
    private LocalDateTime time; // дата и время публикации поста
    private String title; // заголовок поста
    private String text; // текст поста
    @Column(name = "view_count")
    private int viewCount; // количество просмотров поста

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
