package com.rocketseat.planner.trip;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import java.util.UUID;
import java.time.LocalDateTime;

@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID ID;

    @Column(nullable = false)
    private String destination;

    @Column(name="starts_at", nullable = false)
    private LocalDateTime startsAt;

    @Column(name="ends_at", nullable = false)
    private LocalDateTime endsAt;

    @Column(name="is_confirmed", nullable = false)
    private boolean isConfirmed;

    @Column(name="owner_name",nullable = false)
    private String ownerName;

    @Column(name="owner_email",nullable = false)
    private String ownerEmail;



}
//teste
