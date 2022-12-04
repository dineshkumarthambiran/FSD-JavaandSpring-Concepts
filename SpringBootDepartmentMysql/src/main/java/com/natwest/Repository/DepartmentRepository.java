package com.natwest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natwest.Model.DepartmentModel;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentModel, Integer> {}
