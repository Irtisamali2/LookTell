package org.tensorflow.lite.examples.detection.distance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DistanceFinder {
    //create array list of DistanceModel objects person, car, microwave, cell phone, apple,cat,mug, platter, watch, AND remote
    public  static ArrayList<String> _class = new ArrayList<String>(){
        {
            add("person");
            add("car");
            add("microwave");
            add("cell phone");
            add("apple");
            add("cat");
            add("mug");
            add("platter");
            add("watch");
            add("remote");
        }
    };
    public static String getDistanceInInches(String objectName, float widthInPixels){
        if(DistanceFinder._class.contains(objectName)) {
            switch (objectName){
                case "person":// average 15 inches
                    return new DistanceModel("person", 147.606f, 14.0f, 227.5f).calcuteDistanceFromCameraInInches(widthInPixels/2) + " inches";
                case "car":
                    return new DistanceModel("car", 147.606f, 69.6f, 1049.5f).calcuteDistanceFromCameraInInches(widthInPixels/2) + " inches";
                case "microwave":
                    return new DistanceModel("microwave", 147.606f, 30.0f, 452.5f).calcuteDistanceFromCameraInInches(widthInPixels/2) + " inches";
                case "cell phone":
                    return new DistanceModel("cell phone", 147.606f, 5.5f, 84.0f).calcuteDistanceFromCameraInInches(widthInPixels/2) + " inches";
                case "apple":
                    return new DistanceModel("apple", 147.606f, 3.5f, 52.5f).calcuteDistanceFromCameraInInches(widthInPixels/2) + " inches";
                case "cat":
                    return new DistanceModel("cat", 147.606f, 2.75591f, 42.5f).calcuteDistanceFromCameraInInches(widthInPixels/2) + " inches";
                case "mug":
                    return new DistanceModel("mug", 147.606f, 2.99213f, 44.5f).calcuteDistanceFromCameraInInches(widthInPixels/2) + " inches";
                case "platter":
                    return new DistanceModel("platter", 147.606f, 9.75f, 147.5f).calcuteDistanceFromCameraInInches(widthInPixels/2) + " inches";
                case "watch":
                    return new DistanceModel("watch", 147.606f, 1.65354f, 25.5f).calcuteDistanceFromCameraInInches(widthInPixels/2) + " inches";
                case "remote":
                    return new DistanceModel("remote", 147.606f, 1.43f, 21.5f).calcuteDistanceFromCameraInInches(widthInPixels/2) + " inches";


            }

        }
        return " ";
    }



}
