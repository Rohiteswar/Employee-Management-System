package com.belongSable.tech.Employee.Tracking.System.Controller;

import com.belongSable.tech.Employee.Tracking.System.entity.Department;
import com.belongSable.tech.Employee.Tracking.System.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    private final Logger Logger = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public Department SaveDepartment(@Valid @RequestBody Department department){
        return departmentService.SaveDepartment(department);
    }


    @GetMapping("/department")
    public List<Department> fetchDepartmentList(){
        Logger.info("Inside fetchDepartmentList");
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/department/{id}")
    public String FetchDepartmentId(@PathVariable("id") Long departmentId){
        return departmentService.FetchDepartmentId(departmentId);
    }

    @DeleteMapping("/department/{id}")
    public String Delete(@PathVariable("id") Long DepartmentId){
        return departmentService.Delete(DepartmentId);
    }

    @PutMapping("/department/{id}")
    public Department UpdateDepartment(@PathVariable("id") Long DepartmentId,
                                       @RequestBody Department department){
        return departmentService.UpdateDepartment(DepartmentId,department);
    }

    @GetMapping("/department/name/{name}")
    public Department GetValues(@PathVariable("name") String Name){
        return departmentService.GetValues(Name);
    }
}
