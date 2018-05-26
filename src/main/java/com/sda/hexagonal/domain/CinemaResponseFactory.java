package com.sda.hexagonal.domain;


public class CinemaResponseFactory {

    private static CinemaResponseFactory instance;

    public static CinemaResponseFactory instanceOf(){
        if (instance == null){
            instance = new CinemaResponseFactory();
        }
        return instance;
    }

    private CinemaResponseFactory(){
    }

    public CinemaResponse createSuccessResponse(){
        return new CinemaResponse.CinemaResponseBuilder()
                .status(true)
                .message("udalo sie zarezerwowac bilet")
                .build();
    }

    public CinemaResponse createFailureResponse(String message){
        return new CinemaResponse.CinemaResponseBuilder()
                .status(false)
                .message(message)
                .build();
    }
}
