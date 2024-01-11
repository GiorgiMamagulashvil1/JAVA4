package com.example.demo.entities;

import com.example.demo.dtos.DepartmentDto;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "DEPARTMENTS")
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
public class Department extends BaseEntity {

    @Id
    @Column(name = "ID", nullable = false, updatable = false)
    @SequenceGenerator(name = "departmentIdSeq", sequenceName = "DEPARTMENT_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "departmentIdSeq")
    private Long id;

    @Column(name = "NAME", nullable = false, insertable = true, updatable = true)
    private String name;

    public Department(DepartmentDto dto) {
        if (dto != null) {
            this.name = dto.getName();
        }
    }
}