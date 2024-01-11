package com.example.demo.services;

import com.example.demo.dtos.DepartmentDto;
import com.example.demo.entities.Department;
import com.example.demo.jpa.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department addDepartment(DepartmentDto dto) {
        Department department = new Department(dto);
        return departmentRepository.save(department);
    }

}
