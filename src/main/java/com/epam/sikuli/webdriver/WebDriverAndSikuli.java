package com.epam.sikuli.webdriver;

import com.epam.sikuli.notepad.RCClient;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.*;

import java.util.Iterator;

public class WebDriverAndSikuli {

    private static final String PATH = "C:\\Users\\Olha_Pidhorna\\workspace\\Sikuli\\src\\main\\resources\\colors\\";

    public static void main(String[] args) throws Exception {

        WebDriver driver=new FirefoxDriver();
        WebDriverWait wait=new WebDriverWait(driver,20);
        driver.manage().window().maximize();
        driver.get("http://www.thecolor.com/Coloring/a-puppy-with-a-kitten.aspx");
        RCClient client = new RCClient();
//        RemoteScreen sc = new RemoteScreen("127.0.0.1");
//        sc.setMinSimilarity(0.9);
        try {
            client.clickImage(PATH + "down.png");
//            client.clickImage.type (Key.DOWN,Key.DOWN);
//            Settings.MinSimilarity= 1;
            //cat color
//            sc.find("src/main/resources/colors/grey.png");
            client.clickImage(PATH + "grey.png");
//            sc.find("src/main/resources/colors/cat.png");
            client.clickImage(PATH + "cat.png");
//            sc.find("src/main/resources/colors/cat-part.png");
            client.clickImage(PATH + "cat-part.png");


            //dog color
            client.clickImage(PATH + "braun.png");
            client.clickImage(PATH + "dog.png");
            client.clickImage(PATH + "dog-part1.png");
            client.clickImage(PATH + "dog-part2.png");
            client.clickImage(PATH + "dog-part3.png");
            System.out.println("Dog is broun");
//
//            //eyes color
//            Pattern pattern = new Pattern("src/main/resources/colors/blue.png").exact();
//            Region reg = new Region(470,619,200,200);
//            Match green = reg.find(pattern);
////            green.click();
            client.clickImage(PATH + "blue.png");
            client.clickImage(PATH + "cat-eye.png");
            client.clickImage(PATH + "dog-eye.png");
            System.out.println("Eyes are blue");
//            //dog nose
            client.clickImage(PATH + "black.png");
            client.clickImage(PATH + "dog-nose.png");
            System.out.println("Nos is black");
//


        } catch (Exception findFailed) {
            findFailed.printStackTrace();
        }

    }

}
