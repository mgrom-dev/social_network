package com.diplom.social_network.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "captcha_codes")
public class CaptchaCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // id каптчи
    private LocalDateTime time; // дата и время генерации кода капчи
    private String code; // код, отображаемый на картинкке капчи
    @Column(name = "secret_code ")
    private String secretCode; // код, передаваемый в параметре

    @Override
    public String toString() {
        return "Captcha code" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", code='" + code + '\'' +
                ", secret code='" + secretCode + '\'' +
                '}';
    }
}
