package org.renatofreire.poc_payara.Models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@NamedQuery(name = "findAllUsers", query = "SELECT u from UserModel u")
public class UserModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @SequenceGenerator(name = "seq", sequenceName = "seq", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "dateOfBirth")
    private Date dateOfBirth;

    @Column(name = "email")
    private String email;

    public UserModel() {
    }

    public UserModel(String name, Date dateOfBirth, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
