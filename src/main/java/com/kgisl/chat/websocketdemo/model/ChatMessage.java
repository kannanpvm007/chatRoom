package com.kgisl.chat.websocketdemo.model;

//import java.awt.TrayIcon.MessageType;

/**
 * ChatMessage
 */
public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;

    public enum MessageType {
        CHAT, JOIN, LEAVE
    }

    public MessageType getType() {
        return type;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

}