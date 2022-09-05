package tech.getarrays.employeemanager.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "salary_bonus")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SalaryBonus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long salary_id;
    private String amount;
    private String bonus;
    //@OneToMany(mappedBy = "salary_id")
    //private List<Payroll> payrolls;
}

