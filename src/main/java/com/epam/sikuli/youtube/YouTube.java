package com.epam.sikuli.youtube;


import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class YouTube {

    public static void main(String[] args) {

        Screen sc = new Screen();
        try {
            sc.find("src/main/resources/play.png");
            sc.click("src/main/resources/play.png");
            System.out.println("Click on play");
            sc.find("src/main/resources/pause.png");
            sc.click("src/main/resources/pause.png");
            System.out.println("Click on pause");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }

    }

}
