package com.diplom.social_network.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // id тэга
    private String name; // текст тэга

    @Override
    public String toString() {
        return "Tag" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
