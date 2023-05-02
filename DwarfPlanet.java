/**
 * DwarfPlanet.java - Drawing Rectangle Objects
 * Author:     Ethan Grant
 * Module:     3
 * Project:    Homework
 *
 * Instance variables:
 * 1. a  string  named  id  which identifies rectangle object
 * 2. an  int  named  x  which represents the x-coordinate of the upper-left corner of the rectangle on a grid or canvas
 * 3. an  int  named  y  which represents the y-coordinate of the upper-left corner
 * 4. an  int  named  width  which represents the horizontal size (in the 'x' direction) of the rectangle
 * 5. an  int  named  height  which represents the vertical size (in the 'y' direction) of the rectangle
 */

    public class DwarfPlanet 
    {
       // Instance variables
        private String name = "";
        private String discoverer = "";
        private int yearOfDiscovery = 0;
        private double diameter = 0.0; 
        private long distance = 0;
        
        // No arg constructor and full constructor 
        public DwarfPlanet() { }
        public DwarfPlanet(String newName, String newDiscoverer, int newYearOfDiscovery,
        double newDiameter, long newDistance) {
            name = newName;
            discoverer = newDiscoverer;
            yearOfDiscovery = newYearOfDiscovery;
            diameter = newDiameter;
            distance = newDistance;
        }
        
        // Setters
        public void setName(String newName) {
            name = newName;
        }
        public void setDiscoverer(String newDiscoverer) {
            discoverer = newDiscoverer;
        }
        public void setYearOfDiscovery(int newYearOfDiscovery) {
            yearOfDiscovery = (newYearOfDiscovery < 1800 || 
                                newYearOfDiscovery > 2100 ? 1800 : 
                                newYearOfDiscovery);
        }
        public void setDiameter(double newDiameter) {
            diameter = (newDiameter < 0 ? 0 : newDiameter);
        }
        public void setDistance(long newDistance) {
            distance = (newDistance < 0 ? 0 : newDistance);
        }
        
        // Getters 
         public String getName() {
            return name;
        }
         public String getDiscoverer() {
            return discoverer;
        }
        public int getYearOfDiscovery() {
            return yearOfDiscovery;
        }
        public double getDiameter() {
            return diameter;
        }
        public long getDistance() {
            return distance;
        }
       
        // Print out top statements
        public String toString() {
            return discoverer + " discovered " + name + " in the year " +
            yearOfDiscovery + " with a diameter in km: " + diameter +
            " and a distance of " + distance;
        }
    }


