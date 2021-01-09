package com.app.entity;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(name = "user_email_unique", columnNames = "email")
})
@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    //@SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)//SEQUENCE, generator = "user_seq")
    @Column(name="id", updatable = false)
    private Long id;

    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "contact", nullable = false, length = 15)
    private String contact;

    @Column(name = "join_date")
    private LocalDate dateOfJoin;

    @Column(name="password", nullable = false, length = 50)
    private String password;

    public User(String firstName, String lastName, String email, String contact, LocalDate dateOfJoin, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contact = contact;
        this.dateOfJoin = dateOfJoin;
        this.password = password;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
