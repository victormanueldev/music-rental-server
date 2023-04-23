package com.victormalsx.musicrental.track;

import java.util.List;
import java.util.Optional;

public interface TrackDAO {
    List<Track> selectTracks();
    Optional<Track> selectTrackById(int id);
}
