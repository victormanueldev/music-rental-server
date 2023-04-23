package com.victormalsx.musicrental.track;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TrackDataAccessService implements TrackDAO {

    private JdbcTemplate jdbcTemplate;



    @Override
    public List<Track> selectTracks() {
        return null;
    }

    @Override
    public Optional<Track> selectTrackById(int id) {
        return Optional.empty();
    }
}
