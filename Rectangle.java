/**
 * Rectangle.java - Drawing Rectangle Objects
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

    public class Rectangle
    {
       // Instance variables
        private String id = "";
        private int x = 0;
        private int y = 0;
        private int width = 0;
        private int height = 0;
        
        // Constructor
        public Rectangle (String id, int x, int y, int width, int height) {
        setId(id);
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
        System.out.println("In constructor for " + id + " with height " + height +
        " and width " + width + " at position (" + x + "," + y + ")");
        }
        
        // Setters
        public void setId(String newId) {
            System.out.println("Running setter of id for " + id + "with new value " + newId);
            id = newId;
        }
        public void setX(int newX) {
            System.out.println("Running setter of x for " + id + "with new value " + newX);
            x = newX;
        }
        public void setY(int newY) {
            System.out.println("Running setter of y for " + id + "with new value " + newY);
            y = newY;
        }
        public void setWidth(int newWidth) {
            System.out.println("Running setter of width for " + id + "with new value of " +
            newWidth);
            width = newWidth;
        }
        public void setHeight(int newHeight) {
            System.out.println("Running setter of height for " + id + "with new value of " +
            newHeight);
            height = newHeight;
        }
        
        // Getters
        public String getId() {
            return id;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
        public int getWidth() {
            return width;
        }
        public int getHeight() {
            return height;
        }
        
        // Side Methods
        // Draw method
        public void draw () {
            System.out.println("Running draw() for " + id);
        }
        
        // Erase method
        public void erase() {
            System.out.println("Running erase() for " + id);
        }
        
        // Center method
        public void center() {
            // Prints to screen
            System.out.println("Running center() for " + id);
            // Invokes erase
            erase();
            // Prints to screen
            System.out.println("Centering " + id);
            // Invokes draw
            draw();
        }
        // Creates a string with the previous information
        public String toString () {
            String newString = (id + " with height " + height + " and width " + width + 
            " at position(" + x + "," + y + ")");
            System.out.println("Returning toString() for " + newString);
            return newString;  
        }
    }
