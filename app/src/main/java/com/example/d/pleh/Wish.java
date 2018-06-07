package com.example.d.pleh;

import java.util.HashSet;

public class Wish {
    private String title, reward, description, author;
    private HashSet<Integer> confirmed, applying;
    private long id; //todo add id

    public Wish(String title, String reward, String description, String author) {
        this.title = title;
        this.reward = reward;
        this.description = description;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public HashSet<Integer> getConfirmed() {
        return confirmed;
    }

    public void addConfirmed(int IdConfirmed) {
        applying.remove(IdConfirmed);
        confirmed.add(IdConfirmed);
    }

    public HashSet<Integer> getApplying() {
        return applying;
    }

    public void addApplying(int IdApplying) {
        this.applying.add(IdApplying);
    }

    public long getID() { return id;}
}
