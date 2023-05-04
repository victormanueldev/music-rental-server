package com.victormalsx.musicrental.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.HashSet;
import java.util.Set;

@Table(name = "tracks")
@Entity
@Data
@Accessors(chain = true)
public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column
    String name;

    @Column
    Integer popularity;

    @Column
    String imageUrl;

    @Column(length = 5)
    Integer duration;

    @Column(precision = 2)
    Float unitPrice;

    @ManyToOne(targetEntity = Artist.class, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "artist_id", nullable = false, referencedColumnName = "id")
    @JsonBackReference(value = "artist")
    private Artist artist;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "track_to_rental",
            joinColumns = { @JoinColumn(name = "track_id") },
            inverseJoinColumns = { @JoinColumn(name = "rental_id") }
    )
    Set<Rental> rentals = new HashSet<>();

}
