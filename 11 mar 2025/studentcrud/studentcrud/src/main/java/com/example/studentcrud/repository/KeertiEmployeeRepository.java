package com.example.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentcrud.controller.KeertiEmployeeController;
import com.example.studentcrud.model.Employee;

public interface KeertiEmployeeRepository extends JpaRepository<Employee, Long> {
    void save(KeertiEmployeeController emp);
}