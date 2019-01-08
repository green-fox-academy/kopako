package com.seadog.restapi.models;

/**
 * Automatically multiplying received on 2 and stores it to result
 */
public class DoublingDTO {
    private int received;
    private int result;


    public DoublingDTO() {
    }

    public DoublingDTO(int received) {
        this.received = received;
        this.result = received * 2;
    }

    public void setReceived(int received) {
        this.received = received;
        this.result = received * 2;
    }

    public int getReceived() {
        return received;
    }

    public int getResult() {
        return result;
    }
}
