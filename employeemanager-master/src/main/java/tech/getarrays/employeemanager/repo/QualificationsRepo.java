package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.model.Qualifications;

import java.util.Optional;

public interface QualificationsRepo  extends JpaRepository<Qualifications, Long> {
    void deleteQualificationsById(Long qual_id);

    Optional<Qualifications> findQualificationsById(Long qual_id);
}