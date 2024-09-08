package com.example.rocketgui;

// Class creates rocket object with nested nose cone and body objects to store
// separate radius and length variables

public class RocketObject {

    //For NoseCone
    public static class NoseCone {
        private Double radius;
        private Double length;

        //mutators
        public void setRadius(Double radius) { this.radius = radius; }
        public void setLength(Double length) { this.length = length; }

        //accessors
        public Double getRadius() { return radius; }
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
        public Double getRadius() { return radius; }
        public Double getLength() { return length; }
    }
}
