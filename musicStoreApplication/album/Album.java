package org.example.studies.oopApplications.musicStoreApplication.album;


import org.example.studies.oopApplications.musicStoreApplication.customer.Wallet;
import org.example.studies.oopApplications.musicStoreApplication.song.Song;
import org.example.studies.oopApplications.musicStoreApplication.song.MusicCompany;

import java.util.ArrayList;
import java.util.List;

public class Album {
    public static final Album INSTANCE = new Album();

    private String name;
    private String singerName;
    private String releaseDate;



    private final List<Song> songs;
    private final Wallet wallet;

    private Album() {
        songs = new ArrayList<>();
        songs.addAll(fetchSongsFromCompany(new MusicCompany()));
        wallet = new Wallet(-1);
    }

    private List<Song> fetchSongsFromCompany(MusicCompany musicCompany) {
        return musicCompany.getSongs();
    }

    public List<Song> getSongs() {
        return songs;
    }

    public Wallet getWallet() {
        return wallet;
    }
    public Song findSong(String title){

        for(Song checkedSong : songs){
            if(checkedSong.getName().equals(title)) return checkedSong;
        }
        return null;
    }

    public void runSong(Song song) {
        System.out.printf("%s Music is playing", song.getName());
    }
    public boolean addSong(String name, double duration){
        if(findSong(name) == null){
            songs.add(new Song(name,duration));
             System.out.println(name + "successfully added to the list");
            return true;
        }
        else {
             System.out.println("Song with name "+ name+ " already exist in the list");
            return false;
        }
    }
}
