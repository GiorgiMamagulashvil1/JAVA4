package com.example.demo.controller;

import com.example.demo.dtos.DepartmentDto;
import com.example.demo.entities.Department;
import com.example.demo.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/department/add")
    public Department addDepartment(@RequestBody DepartmentDto dto) {
        return departmentService.addDepartment(dto);
    }

}
