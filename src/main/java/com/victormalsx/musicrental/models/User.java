package com.victormalsx.musicrental.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.HashSet;
import java.util.Set;

@Table(name = "users")
@Entity
@Data
@Accessors(chain = true)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(length = 150, nullable = false)
    private String email;

    @Column(length = 20, nullable = false)
    private String phone;

    @Column(nullable = false)
    String password;

    @Column(length = 50, nullable = false)
    String subscriptionType;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "user_to_rental", joinColumns = {@JoinColumn(name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "rental_id")})
    Set<Rental> rentals = new HashSet<>();
}
