package com.example.rocketgui;

/*
* Class creates rocket object with nested nose cone and body objects to store
* separate radius and length variables
* Creates new objectID when
*
*/

import java.util.*;

public class RocketObject {
    // Rocket variables
    private Double length;
    //private int currentID; // ID for every part added to rocket to be used in part array
    private ArrayList<BodyTube> bodyArray;

    // Initializers
    NoseCone cone = new NoseCone(); //hardcoded nose cone temp, use ternary to decided whether to create nosecone or body tube type later
    public void createNoseCone() {
        //
    }
    public void createBodyTube(){
        this.bodyArray.add(new BodyTube());
    }

    // Mutators

    //iterates through each BodyTube object in the bodyArray and adds its length to this.length
    //temp solution ==> change to only alter by edited object amount and retain other info
    public void setLength(){
        this.length = 0.0;
        this.length+=cone.getLength();
        for (BodyTube bodyTube : this.bodyArray) this.length += bodyTube.getLength();
    }

    // Accessors
    public Double getLength(){
        return this.length;
    }

    // Nested Classes

    //for Nose Cone
    public static class NoseCone {
        private Double radius;
        private Double length;

        //mutators
        public void setRadius(Double radius) { this.radius = radius; }
        public void setLength(Double length) { this.length = length; }

        //accessors
        public Double getRadius() { return this.radius; }
        public Double getLength() { return length; }
    }

    //For Tube
    public static class BodyTube {
        private Double radius;
        private Double length;

        //mutators
        public void setRadius(Double radius) { this.radius = radius; }
        public void setLength(Double length) { this.length = length; }

        //accessors
        public Double getRadius() { return this.radius; }
        public Double getLength() { return this.length; }
    }
}
