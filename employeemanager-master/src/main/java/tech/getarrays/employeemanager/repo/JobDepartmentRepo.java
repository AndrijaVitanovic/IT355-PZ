package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.JobDepartment;

import java.util.Optional;

public interface JobDepartmentRepo extends JpaRepository<JobDepartment, Long> {
    void deleteJobDepartmentById(Long job_id);

    Optional<JobDepartmentRepo> findJobDepartmentById(Long job_id);
}