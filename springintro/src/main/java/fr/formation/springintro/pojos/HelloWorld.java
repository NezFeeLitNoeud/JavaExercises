package fr.formation.springintro.pojos;

import java.time.LocalDateTime;

public class HelloWorld {
    String text;
    LocalDateTime date;

    public HelloWorld(String text, LocalDateTime date) {
        this.text = text;
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
