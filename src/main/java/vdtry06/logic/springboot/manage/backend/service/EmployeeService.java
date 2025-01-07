package vdtry06.logic.springboot.manage.backend.service;

import vdtry06.logic.springboot.manage.backend.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(long employeeId, EmployeeDto updateEmployee);

    void deleteEmployee(long employeeId);
}
