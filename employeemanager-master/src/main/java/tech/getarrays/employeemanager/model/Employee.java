package tech.getarrays.employeemanager.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long emp_id;
    private String name;
    private String email;
    private String gender;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String employeeCode;
    //@OneToMany(mappedBy = "employee_fk")
    //private List<Qualification> qualifications;
    //@OneToMany(mappedBy = "employee_fk")
    //private List<Leave> leaves;
    //@OneToMany(mappedBy = "employee_fk")
    //private List<Payroll> payrolls;
}
