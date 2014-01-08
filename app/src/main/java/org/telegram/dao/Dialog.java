package org.telegram.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table DIALOG.
 */
public class Dialog {

    private long id;
    private int unreadCount;
    private int topMessageId;
    private int senderId;
    private int date;
    private int contentType;
    private String message;
    private int messageState;
    private byte[] extras;
    private int lastLocalViewedMessage;
    private int lastRemoteViewedMessage;
    private boolean failure;
    private long firstUnreadMessage;

    public Dialog() {
    }

    public Dialog(long id) {
        this.id = id;
    }

    public Dialog(long id, int unreadCount, int topMessageId, int senderId, int date, int contentType, String message, int messageState, byte[] extras, int lastLocalViewedMessage, int lastRemoteViewedMessage, boolean failure, long firstUnreadMessage) {
        this.id = id;
        this.unreadCount = unreadCount;
        this.topMessageId = topMessageId;
        this.senderId = senderId;
        this.date = date;
        this.contentType = contentType;
        this.message = message;
        this.messageState = messageState;
        this.extras = extras;
        this.lastLocalViewedMessage = lastLocalViewedMessage;
        this.lastRemoteViewedMessage = lastRemoteViewedMessage;
        this.failure = failure;
        this.firstUnreadMessage = firstUnreadMessage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getUnreadCount() {
        return unreadCount;
    }

    public void setUnreadCount(int unreadCount) {
        this.unreadCount = unreadCount;
    }

    public int getTopMessageId() {
        return topMessageId;
    }

    public void setTopMessageId(int topMessageId) {
        this.topMessageId = topMessageId;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getContentType() {
        return contentType;
    }

    public void setContentType(int contentType) {
        this.contentType = contentType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getMessageState() {
        return messageState;
    }

    public void setMessageState(int messageState) {
        this.messageState = messageState;
    }

    public byte[] getExtras() {
        return extras;
    }

    public void setExtras(byte[] extras) {
        this.extras = extras;
    }

    public int getLastLocalViewedMessage() {
        return lastLocalViewedMessage;
    }

    public void setLastLocalViewedMessage(int lastLocalViewedMessage) {
        this.lastLocalViewedMessage = lastLocalViewedMessage;
    }

    public int getLastRemoteViewedMessage() {
        return lastRemoteViewedMessage;
    }

    public void setLastRemoteViewedMessage(int lastRemoteViewedMessage) {
        this.lastRemoteViewedMessage = lastRemoteViewedMessage;
    }

    public boolean getFailure() {
        return failure;
    }

    public void setFailure(boolean failure) {
        this.failure = failure;
    }

    public long getFirstUnreadMessage() {
        return firstUnreadMessage;
    }

    public void setFirstUnreadMessage(long firstUnreadMessage) {
        this.firstUnreadMessage = firstUnreadMessage;
    }

}
