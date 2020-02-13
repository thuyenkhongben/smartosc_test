package com.code.model.role;

import com.code.model.role.Role;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "users" , uniqueConstraints = {
            @UniqueConstraint(columnNames = {
                    "username"
            }),
        @UniqueConstraint(columnNames = {
                "email"
        })

})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @NotBlank
    @Size(min = 6 , max = 60)
    private String lastName;

    @NotBlank
    @Size(min = 6 , max = 60)
    private  String firstName;

    @NaturalId
   @NotBlank
   @Email
    @Size(max = 50)
    @Column(name = "email" , nullable = false , unique = true)
    private String email;


    @Transient
    private String passwordConfirm;

    @ManyToMany
    private Set<Role> roles;

}
