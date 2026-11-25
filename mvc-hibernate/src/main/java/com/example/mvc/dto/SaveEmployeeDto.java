package com.example.mvc.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SaveEmployeeDto {
    private Integer id;
    private String name;
    private String surname;
    private String department;
    private Integer salary;
}
