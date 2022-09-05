package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import tech.getarrays.employeemanager.exception.UserNotFoundException;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.model.Leave;
import tech.getarrays.employeemanager.repo.EmployeeRepo;
import tech.getarrays.employeemanager.repo.LeaveRepo;

import java.util.List;
import java.util.UUID;

public class LeaveService {
    private final LeaveRepo leaveRepo;

    @Autowired
    public LeaveService(LeaveRepo leaveRepo) {
        this.leaveRepo = leaveRepo;
    }

    public Leave addLeave(Leave leave) {
        leave.setReason(UUID.randomUUID().toString());
        return leaveRepo.save(leave);
    }

    public List<Leave> findAllLeaves() {
        return leaveRepo.findAll();
    }

    public Leave updateLeave(Leave leave) {
        return leaveRepo.save(leave);
    }

    public Leave findLeaveById(Long id) {
        return leaveRepo.findLeaveById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteLeave(Long id){
        leaveRepo.deleteLeaveById(id);
    }
}