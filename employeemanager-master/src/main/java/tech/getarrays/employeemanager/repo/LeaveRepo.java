package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.model.Leave;

import java.util.Optional;

public interface LeaveRepo extends JpaRepository<Leave, Long> {
    void deleteLeaveById(Long leave_id);

    Optional<Leave> findLeaveById(Long leave_id);
}
