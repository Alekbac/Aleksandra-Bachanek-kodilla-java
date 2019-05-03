package com.kodilla.good.patterns.Allegro;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime date;
    private String item;

    public OrderRequest(User user, LocalDateTime date, String item) {
        this.user = user;
        this.date = date;
        this.item = item;
    }

    public User getUser(){
        return user;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getItem() {
        return item;
    }
}
