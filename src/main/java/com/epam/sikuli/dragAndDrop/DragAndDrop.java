package com.epam.sikuli.dragAndDrop;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class DragAndDrop {

    public static void main(String[] args) {

        Screen sc = new Screen();
        try {
            sc.dragDrop("src/main/resources/pdf.png","src/main/resources/newplace2.png");
            System.out.println("Change df place");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }

    }

}
