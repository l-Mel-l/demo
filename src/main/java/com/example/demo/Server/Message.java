package com.example.demo.Server;

import jakarta.persistence.*;
import lombok.*;
@Data
@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sender;
    private String receiver;
    private String text;
}