package com.example.firstproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Member {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String email;

    @Column
    private String password;

    public Member(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
