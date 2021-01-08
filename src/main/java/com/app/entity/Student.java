package com.app.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "student", uniqueConstraints = {
        @UniqueConstraint(name = "student_email_unique", columnNames = "email")
})
@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @SequenceGenerator(name = "student_seq", sequenceName = "student_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @Column(name="id", updatable = false)
    private Long id;

    @Column(name = "first_name", length = 30, nullable = false, columnDefinition = "TEXT")
    private String firstName;

    @Column(name = "last_name", length = 30, nullable = false, columnDefinition = "TEXT")
    private String lastName;

    @Column(name = "email", nullable = false, length = 30, columnDefinition = "TEXT")
    private String email;

    @Column(name = "age", nullable = false)
    private Integer age;

    public Student(String firstName, String lastName, String email, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
}
