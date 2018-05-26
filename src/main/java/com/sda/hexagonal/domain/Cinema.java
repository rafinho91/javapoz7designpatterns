package com.sda.hexagonal.domain;

public class Cinema {
    private CinemaReservationSystem cinemaReservationSystem;
    private CinemaNotificationSystem cinemaNotificationSystem;
    private CinemaResponseFactory cinemaResponseFactory;

    public Cinema(CinemaReservationSystem cinemaReservationSystem, CinemaNotificationSystem cinemaNotificationSystem) {
        this.cinemaReservationSystem = cinemaReservationSystem;
        this.cinemaNotificationSystem = cinemaNotificationSystem;
    }

    public CinemaResponse book(CinemaRequest cinemaRequest){
        CinemaReservationResponse response = cinemaReservationSystem.book(cinemaRequest);
        if (response.getStatus() != null){
            //nie udalo sie
        }
        CinemaNotificationResponse notificationResponse = cinemaNotificationSystem.sendNotification(cinemaRequest);
        if (notificationResponse.getStatus() != null){
            //nie udalo sie
        }
        return cinemaResponseFactory.createSuccessResponse();
    }
}
