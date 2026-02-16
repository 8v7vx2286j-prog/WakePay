package com.wakepay.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Alarm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDateTime triggerTime;

    // Getters and Setters 
}