package com.adenlie.adventureclub.model;

import lombok.Getter;

@Getter
public class Event {
    private String name;
    private String description;
    private Long price;

    public Event(String name, String description, Long price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
