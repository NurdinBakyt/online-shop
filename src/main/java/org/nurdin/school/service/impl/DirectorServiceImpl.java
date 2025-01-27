package org.nurdin.school.service.impl;

import org.nurdin.school.entity.DirectorEntity;
import org.nurdin.school.entity.EmployeeEntity;
import org.nurdin.school.repository.DirectorRepository;
import org.nurdin.school.repository.EmployeeRepository;
import org.nurdin.school.service.DirectorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorServiceImpl implements DirectorService {
    private final EmployeeRepository employeeRepository;
    private final DirectorRepository directorRepository;

    public DirectorServiceImpl(EmployeeRepository employeeRepository, DirectorRepository directorRepository) {
        this.employeeRepository = employeeRepository;
        this.directorRepository = directorRepository;
    }

    @Override
    public List<EmployeeEntity> getEmployeesBid(Long directorId) {
        DirectorEntity director = directorRepository.findById(directorId).
                orElseThrow(() -> new RuntimeException("Директор не найден"));

        return director.getEmployeeEntities();
    }
}
