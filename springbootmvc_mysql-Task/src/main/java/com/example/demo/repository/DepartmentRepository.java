package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {}