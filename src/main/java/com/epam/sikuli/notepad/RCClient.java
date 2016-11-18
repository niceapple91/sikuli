package com.epam.sikuli.notepad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class RCClient {

    private static void send(String resource){
        Socket echoSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        try {
            echoSocket = new Socket("127.0.0.1", 10007);

            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));;
            out = new PrintWriter(echoSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
            out.println(resource);
            out.close();
            in.close();
            stdIn.close();
            echoSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void clickImage(String resource){
        send("click " + resource);
    }

    public void doubleClick(String resource){

    }

    public void typeText(String sourceImagePath, String msg){
        send("typeIntoSpecificRegion " + sourceImagePath + " " + msg);
    }
}
