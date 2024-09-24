package com.example.stepik.entities;

import jakarta.persistence.*;
import lombok.*;


import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Users  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String fullName;
    @NonNull
    private String email;
    @NonNull
    private String password;
}
