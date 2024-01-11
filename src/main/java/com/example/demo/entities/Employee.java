package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "EMPLOYEES")
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
public class Employee extends BaseEntity{

    @Id
    @Column(name = "ID", nullable = false, updatable = false)
    @SequenceGenerator(name = "employeeIdSeq", sequenceName = "EMPLOYEE_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employeeIdSeq")
    private Long id;

    @Column(name = "FULL_NAME", nullable = false, insertable = true, updatable = true)
    private String fullName;

    @Column(name = "SALARY")
    private Integer salary;

    @ManyToOne
    private Department department;
}
