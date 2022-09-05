package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.model.SalaryBonus;

import java.util.Optional;

public interface SalaryBonusRepo extends JpaRepository<SalaryBonus, Long> {
    void deleteSalaryBonusById(Long salary_id);

    Optional<SalaryBonus> findSalaryBonusById(Long salary_id);
}