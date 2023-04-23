package com.victormalsx.musicrental.rental;

import com.victormalsx.musicrental.track.Track;

import java.time.LocalDate;
import java.util.List;

public record Rental(Integer id, Float totalPrice, LocalDate datetime, String devolutionStatus, String paymentMethod,
                     String paymentStatus, List<Track> tracks) {
}
