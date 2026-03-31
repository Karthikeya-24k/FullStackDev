package com.example.task.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class sfdsdfdfd {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private  String password;

    public sfdsdfdfd(String username) {
        this.username = username;
    }

                    public sfdsdfdfd(String username, String hashedPassword) {
    }
}
