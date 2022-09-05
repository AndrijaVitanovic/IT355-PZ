package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import tech.getarrays.employeemanager.exception.UserNotFoundException;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.model.JobDepartment;
import tech.getarrays.employeemanager.repo.EmployeeRepo;
import tech.getarrays.employeemanager.repo.JobDepartmentRepo;

import java.util.List;
import java.util.UUID;

public class JobDepartmentService {
    private final JobDepartmentRepo jobDepartmentRepo;

    @Autowired
    public JobDepartmentService(JobDepartmentRepo jobDepartmentRepo) {
        this.jobDepartmentRepo = jobDepartmentRepo;
    }

    public JobDepartment addJobDepartment(JobDepartment jobDepartment) {
        jobDepartment.setJobDept(UUID.randomUUID().toString());
        return jobDepartmentRepo.save(jobDepartment);
    }

    public List<JobDepartment> findAllJobsDepartments() {
        return jobDepartmentRepo.findAll();
    }

    public JobDepartment updateJobDepartment(JobDepartment jobDepartment) {
        return jobDepartmentRepo.save(jobDepartment);
    }

    public JobDepartment findJobDepartmentsById(Long id) {
        return (JobDepartment) jobDepartmentRepo.findJobDepartmentById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteJobDepartmentById(Long id){
        jobDepartmentRepo.deleteJobDepartmentById(id);
    }
}
