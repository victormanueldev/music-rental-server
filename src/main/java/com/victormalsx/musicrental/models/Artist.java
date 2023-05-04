package com.victormalsx.musicrental.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Table
@Entity
@Data
@Accessors(chain = true)
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column
    String name;

    @OneToMany(targetEntity = Track.class, mappedBy = "artist")
    @JsonManagedReference(value = "tracks")
    private List<Track> tracks;

}
