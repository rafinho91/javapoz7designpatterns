package com.sda.hexagonal.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CinemaReservationResponse {
    private CinemaReservationStatus status;
}
