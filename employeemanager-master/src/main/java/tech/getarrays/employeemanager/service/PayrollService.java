package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import tech.getarrays.employeemanager.exception.UserNotFoundException;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.model.Payroll;
import tech.getarrays.employeemanager.repo.EmployeeRepo;
import tech.getarrays.employeemanager.repo.PayrollRepo;

import java.util.List;
import java.util.UUID;

public class PayrollService {
    private final PayrollRepo payrollRepo;

    @Autowired
    public PayrollService(PayrollRepo payrollRepo) {
        this.payrollRepo = payrollRepo;
    }

    public Payroll addPayroll(Payroll payroll) {
        payroll.setTotalAmount(UUID.randomUUID().toString());
        return payrollRepo.save(payroll);
    }

    public List<Payroll> findPayrolles() {
        return payrollRepo.findPayrollById();
    }

    public Payroll updatePayrolle(Payroll payrole) {
        return payrollRepo.save(payroll);
    }

    public Employee findPayrollById(Long id) {
        return payrollRepo.findAll(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deletePayrolle(Long id){
        payrollRepo.deletePayrollById(id);
    }
}