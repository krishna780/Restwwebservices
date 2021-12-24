package com.springJpa.SpringJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


import javax.persistence.*;

@Entity
@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student",uniqueConstraints = @UniqueConstraint(columnNames = {"email_address"}) )
public class Student {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    private Long studentid;
    private String firstName;
    private String lastName;
    @Column(name = "email_address", nullable = false)
    private String emailid;
    private String gurdianName;
    private String gurdianEmail;
    @Column(name = "phoneNumber")
    private String gurdianPhone;
}
