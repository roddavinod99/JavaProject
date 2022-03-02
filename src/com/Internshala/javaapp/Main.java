package com.Internshala.javaapp;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        boolean green = true;
        if (green) {
            System.out.println("You are allowed to move");
        } else {
            System.out.println("Please stop");
        }
        String message;
        message = (green) ? " You are allowed to move" : "Please stop";
        System.out.println(message);
    }
}