package org.example.studies.oopApplications.musicStoreApplication.song;

import java.util.ArrayList;
import java.util.List;

public class MusicCompany {
    private final List<Song> Songs;

    public MusicCompany() {
        Songs = new ArrayList<>();
        Songs.add(new Song(1, "Tarkan ", 0));
        Songs.add(new Song(2, "Sezen Aksu", 300));
        Songs.add(new Song(3, "Muslum Gurses", 250));
        Songs.add(new Song(4, "Fazıl Say", 500));
    }

    public List<Song> getSongs() {
        return Songs;
    }

}
