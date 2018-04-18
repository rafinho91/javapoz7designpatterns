package com.sda.di;

public class Cinema {
    private CinemaReservation cinemaReservation;
    private CinemaNotifier cinemaNotifier;

    //ZLE
    public Cinema() {
        this.cinemaReservation = new CinemaReservation();
        this.cinemaNotifier = new CinemaNotifier();
    }

    //DOBRZE    - łatwiej mockować/testować
    public Cinema(CinemaReservation cinemaReservation, CinemaNotifier cinemaNotifier) {
        this.cinemaReservation = cinemaReservation;
        this.cinemaNotifier = cinemaNotifier;
    }

    public void book(String value){

    }
}
