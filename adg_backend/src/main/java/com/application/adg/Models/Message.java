package com.application.adg.Models;

import jakarta.persistence.*;

@Entity
@Table(name="the_sentence")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String sentence;

    public Message() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public Message(Long id, String sentence) {
        this.id = id;
        this.sentence = sentence;
    }
}
