package com.victormalsx.musicrental.artist;

import com.victormalsx.musicrental.track.Track;

import java.util.List;

public record Artist(Integer id, String name, List<Track> tracks) {
}
