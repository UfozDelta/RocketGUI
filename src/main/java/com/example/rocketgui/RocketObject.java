package com.example.rocketgui;

// Class creates rocket object with nested nose cone and body objects to store
// separate radius and length variables

public class RocketObject {
    // Rocket variables
    private Double length;

    // Intializers


    // Mutators
    public void setLength(){
        this.length = ;
    }

    // Accessors
    public Double getLength(){
        return this.length;
    }

    // Nested Classes

    //for Nose Cone
    public class NoseCone {
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
