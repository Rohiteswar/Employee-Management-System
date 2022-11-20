package com.belongSable.tech.Employee.Tracking.System.repository;

import com.belongSable.tech.Employee.Tracking.System.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    Department findBydepartmentname(String departmentName);

}
