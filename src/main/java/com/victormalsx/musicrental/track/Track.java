package com.victormalsx.musicrental.track;

public record Track(Integer id, String name, String artist, Integer popularity, String imageUrl, Integer duration,
                    Float unitPrice) {
}
