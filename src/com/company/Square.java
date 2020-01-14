package com.company;

public class Square {

    private double side;

        Square(double s)
        {
             side = s;
        }

        public double calculateArea()
        {
             return side * side;

        }
    public String toString ()
    {
        return "Square with side " + side ;
    }

}

