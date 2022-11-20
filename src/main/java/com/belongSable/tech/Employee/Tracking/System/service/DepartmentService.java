package com.belongSable.tech.Employee.Tracking.System.service;

import com.belongSable.tech.Employee.Tracking.System.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department SaveDepartment(Department department);

    List<Department> fetchDepartmentList();

    String FetchDepartmentId(Long DepartmentId);

    String Delete(Long departmentId);

    Department UpdateDepartment(Long departmentId, Department department);

    Department GetValues(String name);
}
