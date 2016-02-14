package com.adp.chabok.data.models;

import java.sql.Timestamp;

/**
 * Created by m.tajik
 * on 2/6/2016.
 */
public class MessageTO {

    private long id;
    private String serverId;
    private String message;
    private Timestamp sentDate;
    private Timestamp receivedDate;
    private boolean read;
    private boolean header;
    private String mdata;
    private String senderId;

    public MessageTO() {
    }

    public MessageTO(String serverId,
                     String message,
                     Timestamp sentDate,
                     Timestamp receivedDate,
                     boolean read,
                     String mdata
            , String senderId) {
        this.serverId = serverId;
        this.message = message;
        this.sentDate = sentDate;
        this.receivedDate = receivedDate;
        this.read = read;
        this.mdata = mdata;
        this.senderId = senderId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Timestamp getSentDate() {
        return sentDate;
    }

    public void setSentDate(Timestamp sentDate) {
        this.sentDate = sentDate;
    }

    public Timestamp getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Timestamp receivedDate) {
        this.receivedDate = receivedDate;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean isHeader() {
        return header;
    }

    public void setHeader(boolean header) {
        this.header = header;
    }

    public String getData() {
        return this.mdata;
    }

    public void setData(String mdata) {
        this.mdata = mdata;
    }

    public String getSenderId() {
        return this.senderId;
    }

    public void setSenderId(String mdata) {
        this.senderId = mdata;
    }
}