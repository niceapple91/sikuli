package com.epam.sikuli.notepad;

import org.sikuli.remote.client.RemoteScreen;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class NotePad {

    public static void main(String[] args) throws Exception {

        Screen sc = new Screen();
        try {
            sc.find("src/main/resources/notepad-icon.png");
            System.out.println("Click on notepad-icon");
            sc.find("src/main/resources/notepad.png");
            sc.type("src/main/resources/notepad.png", "Sikuli testing");
            System.out.println("Click on notepad");
            sc.click("src/main/resources/close.png");
            System.out.println("Close notepad");
            sc.click("src/main/resources/dontsave.png");
            System.out.println("Don`t save changes");
        } catch (Exception findFailed) {
            findFailed.printStackTrace();
        }

    }


}
