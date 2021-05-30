package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CatFact {
    private Status status;
    private String type;
    private boolean deleted;
    private String id;
    private String user;
    private String text;
    private String source;
    private String updatedAt;
    private String createdAt;
    private boolean used;
    private int v;

    public CatFact(
            @JsonProperty("status") Status status,
            @JsonProperty("type") String type,
            @JsonProperty("deleted") boolean deleted,
            @JsonProperty("_id") String id,
            @JsonProperty("user") String user,
            @JsonProperty("text") String text,
            @JsonProperty("source") String source,
            @JsonProperty("updateAt") String updatedAt,
            @JsonProperty("createAt") String createdAt,
            @JsonProperty("used") boolean used,
            @JsonProperty("__v") int v
    ) {
        this.status = status;
        this.type = type;
        this.deleted = deleted;
        this.id = id;
        this.user = user;
        this.text = text;
        this.source = source;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.used = used;
        this.v = v;
    }

    public int getV() {
        return v;
    }

    @Override
    public String toString() {
        return "CatFact{" +
                "status=" + status +
                ", type='" + type + '\'' +
                ", deleted=" + deleted +
                ", id='" + id + '\'' +
                ", user='" + user + '\'' +
                ", text='" + text + '\'' +
                ", source='" + source + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", used=" + used +
                ", v=" + v +
                '}';
    }

    public Status getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public String getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getText() {
        return text;
    }

    public String getSource() {
        return source;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public boolean isUsed() {
        return used;
    }

    /*    public CatFact(
            @JsonProperty("") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") User user,
            @JsonProperty("upvotes") int upvotes,
            @JsonProperty("userUpvoted") int userUpvoted
    ) {
        this.id = id;
        this.text = text;
        this.user = user;
        this.upvotes = upvotes;
        this.userUpvotes = userUpvoted;
    }*/


}
