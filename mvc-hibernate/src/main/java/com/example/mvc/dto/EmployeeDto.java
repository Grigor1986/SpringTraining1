package com.example.mvc.dto;

import lombok.*;


@Builder
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class EmployeeDto {
    private Integer id;
    private String empName;
    private String surname;
    private String department;
}
