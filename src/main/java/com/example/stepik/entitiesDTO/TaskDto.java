package com.example.stepik.entitiesDTO;

import com.example.stepik.entities.Status;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class TaskDto {
    private Long id;
    private String name;
    private Status status;
    private UsersDto user;
}
