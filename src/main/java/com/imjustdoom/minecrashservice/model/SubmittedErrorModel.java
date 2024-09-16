package com.imjustdoom.minecrashservice.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class SubmittedErrorModel {

    // Unused. Not sure if it will be implemented again in the future

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private LocalDateTime submitTime;
    @Lob
    @Column(length = 102400)
    private String error;

    public SubmittedErrorModel() {}

    public SubmittedErrorModel(String error) {
        this.submitTime = LocalDateTime.now();
        this.error = error;
    }

    public Integer getId() {
        return this.id;
    }

    public LocalDateTime getSubmitTime() {
        return this.submitTime;
    }

    public String getError() {
        return this.error;
    }
}
