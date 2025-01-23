package org.nurdin.school.controller;

import org.nurdin.school.dto.EmployeeDTO;
import org.nurdin.school.entity.EmployeeEntity;
import org.nurdin.school.service.EmployeeService;
import org.nurdin.school.util.EmployeeMapper;
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
                                                    @RequestBody EmployeeDTO employeeDTO) {
        EmployeeEntity employee = employeeService.bidToEmployee(EmployeeMapper.employeeDTOtoEntity(employeeDTO), directorId);
        return ResponseEntity.ok(employee);
    }
}