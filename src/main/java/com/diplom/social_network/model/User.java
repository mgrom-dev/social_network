package com.diplom.social_network.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // id пользователя
    @Column(name = "is_moderator")
    private int isModerator; // является ли пользователь модератором (может ли править глобальные настройки сайта и модерировать посты)
    @CreationTimestamp
    @Column(name = "reg_time", columnDefinition = "timestamp with time zone")
    private LocalDateTime regTime; // дата и время регистрации пользователя
    private String name; // имя пользователя
    private String email; // e-mail пользователя
    private String password; // хэш пароля пользователя
    @Column(name = "code")
    private String recoveryCode; // код для восстановления пароля, может быть NULL
    @Column(name = "photo")
    private String urlPhoto; // фотография (ссылка на файл), может быть NULL

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
