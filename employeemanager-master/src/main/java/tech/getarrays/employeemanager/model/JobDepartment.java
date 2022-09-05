package tech.getarrays.employeemanager.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "job_department")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long job_id;
    @Column(name = "job_department")
    private String jobDept;
    private String jobName;
    private String description;
    //@OneToMany(mappedBy = "job_fk")
    //private List<SalaryBonus> salarybonuses;
    //@OneToMany(mappedBy = "job_fk")
    //private List<Payroll> payrolls;
}
