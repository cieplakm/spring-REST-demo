package com.mmc.rest.RESTAppDemo;

public class HelloMessage {
    public String getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    String helloMessage;
    HelloMessage(String helloMessage ) {
        this.helloMessage = helloMessage;
    }
}
