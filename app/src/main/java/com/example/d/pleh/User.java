package com.example.d.pleh;

import java.util.HashSet;

public class User {
    String phone, address, name, email;
    Reward reward;
    HashSet<Integer> requests, accomplishments, inProcess;
    long id; //todo add id

    public User(String phone, String address, String name, Reward reward,
                HashSet<Integer> requests, HashSet<Integer> accomplishments,
                HashSet<Integer> inProcess, String email) {
        this.phone = phone;
        this.address = address;
        this.name = name;
        this.reward = reward;
        this.requests = requests;
        this.accomplishments = accomplishments;
        this.inProcess = inProcess;
        this.email = email;//todo get+set
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Reward getReward() {
        return reward;
    }

    public void setReward(Reward reward) {
        this.reward = reward;
    }

    public HashSet<Integer> getRequests() {
        return requests;
    }

    public void addRequests(int requestId) {
        this.requests.add(requestId);
    }

    public void removeRequests(int requestId) {
        this.requests.remove(requestId);
    }

    public HashSet<Integer> getAccomplishments() {
        return accomplishments;
    }

    public void addAccomplishments(int accomplishmentID) {
        this.accomplishments.add(accomplishmentID);
    }

    public HashSet<Integer> getInProcess() {
        return inProcess;
    }

    public void addInProcess(int inProcess) {
        this.inProcess.add(inProcess);
    }

    public void removeInProcess(int inProcess) {
        this.inProcess.remove(inProcess);
    }

    public long getID() { return id;}

}
