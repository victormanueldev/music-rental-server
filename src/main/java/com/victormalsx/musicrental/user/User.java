package com.victormalsx.musicrental.user;

import com.victormalsx.musicrental.rental.Rental;

import java.util.List;

public record User(Integer id, String name, String email, String phone, String password, String subscriptionType,
                   List<Rental> rentals) {
}
