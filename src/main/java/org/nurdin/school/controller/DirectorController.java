package org.nurdin.school.controller;

import org.nurdin.school.entity.EmployeeEntity;
import org.nurdin.school.service.DirectorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/director")
public class DirectorController {
    private final DirectorService directorService;

    public DirectorController(DirectorService directorService) {
        this.directorService = directorService;
    }

    @GetMapping("/application/{directorId}")
    public ResponseEntity<List<EmployeeEntity>> findBidsByDirectorId(@PathVariable("directorId") Long directorId) {
        List<EmployeeEntity> employeeEntities = directorService.getEmployeesBid(directorId);
        return ResponseEntity.ok(employeeEntities);
    }
}
