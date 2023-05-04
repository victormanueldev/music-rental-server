package com.victormalsx.musicrental.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Table(name = "rentals")
@Entity
@Data
@Accessors(chain = true)
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column
    Float totalPrice;

    @Column
    LocalDate datetime;

    @Column
    String devolutionStatus;

    @Column
    String paymentMethod;

    @Column
    String paymentStatus;

    @ManyToMany(mappedBy = "rentals")
    private Set<User> users = new HashSet<>();

    @ManyToMany(mappedBy = "rentals")
    private Set<Track> tracks = new HashSet<>();
}
