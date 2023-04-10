package org.example.studies.oopApplications.musicStoreApplication.song;

import org.example.studies.oopApplications.musicStoreApplication.album.Album;

public class Song {
    private  int id;
    private final String name;

    private String singer;

    private double duration;

    Album album;
    private int price;

    public Song(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Song(String name, double duration) {

        this.name = name;
        this.duration = duration;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
