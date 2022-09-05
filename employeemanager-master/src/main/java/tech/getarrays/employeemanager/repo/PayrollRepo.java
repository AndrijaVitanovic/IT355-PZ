package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PayrollRepo extends JpaRepository<PayrollRepo, Long> {
    void deletePayrollById(Long payroll_id);

    Optional<PayrollRepo> findPayrollById(Long payroll_id);
}
