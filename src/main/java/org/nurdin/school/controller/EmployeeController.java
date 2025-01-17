package org.nurdin.school.controller;

import org.nurdin.school.entity.EmployeeEntity;
import org.nurdin.school.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/createBid/{directorId}")
    public ResponseEntity<EmployeeEntity> createBid(@PathVariable("directorId") Long directorId,
                                                    @RequestBody EmployeeEntity employeeEntity) {
        EmployeeEntity employee = employeeService.bidToEmployee(employeeEntity, directorId);
        return ResponseEntity.ok(employee);
    }
}
