package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {
    private boolean verified;
    private int sentCount;

    public boolean isVerified() {
        return verified;
    }

    public int getSentCount() {
        return sentCount;
    }

    @Override
    public String toString() {
        return "Status{" +
                "verified=" + verified +
                ", sentCount=" + sentCount +
                '}';
    }

    public Status(
            @JsonProperty("verified") boolean verified,
            @JsonProperty("sentCount") int sentCount
    ) {
        this.verified = verified;
        this.sentCount = sentCount;
    }
}
