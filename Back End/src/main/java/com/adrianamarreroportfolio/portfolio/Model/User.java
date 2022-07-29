package com.adrianamarreroportfolio.portfolio.Model;

import javax.persistence.*;
import java.util.List;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String profilePic;

    @OneToMany (fetch = FetchType.LAZY, mappedBy = "idEducation")
    private List<Education> educationList;

    public User() {
    }

    public User(Long id, String name, String lastName, String profilePic) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.profilePic = profilePic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
}