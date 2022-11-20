package com.belongSable.tech.Employee.Tracking.System.service;

import com.belongSable.tech.Employee.Tracking.System.entity.Department;
import com.belongSable.tech.Employee.Tracking.System.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

@Service
public class DepartmentServiceImp implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department SaveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public String FetchDepartmentId(Long DepartmentId){
        try {
            String Data = String.valueOf(departmentRepository.findById(DepartmentId).get());
            return Data;
        }
        catch(NoSuchElementException e){
            return "Data is not present, Please Search for a Valid Id!";
        }
    }

    @Override
    public String Delete(Long departmentId) {
        try {
            departmentRepository.deleteById(departmentId);
            return "Deleted Succesfully";
        }
        catch (EmptyResultDataAccessException e){
            return "Data You want to delete is not present. Please enter a valid id";
        }
    }


    @Override
    public Department UpdateDepartment(Long departmentId, Department department) {
        Department depDb = departmentRepository.findById(departmentId).get();
        if (Objects.nonNull(department.getDepartmentname()) && !"".equalsIgnoreCase(department.getDepartmentname())) {
            depDb.setDepartmentname(department.getDepartmentname());
        }

        if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
            depDb.setDepartmentCode(department.getDepartmentCode());
        }

        if (Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
            depDb.setDepartmentAddress(department.getDepartmentAddress());
        }
        return departmentRepository.save(depDb);
    }

    @Override
    public Department GetValues(String name) {
        return departmentRepository.findBydepartmentname(name);
    }
}
