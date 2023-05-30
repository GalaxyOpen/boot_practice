package com.example.demo_2.entity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="album_table")

public class albumEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String song_name;

    @Column(length = 50, nullable = false)
    private String song_album;

    @Column
    private int song_playtime;

    @Column(length = 50, nullable = false)
    private String song_artist;

    @Column(length = 500)
    private String song_lyrics;
    @Column
    private String songGenre;
}
