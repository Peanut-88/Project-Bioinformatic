package com.utils;

/**
 * The Coordinate class is used to represent the coordinates of an atom
 *
 * @author Rachid AHMED
 * @version 1.0
 */
public class Coordinate {
    private double x, y, z;

    public Coordinate(double x, double y, double z) {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    /**
     *
     * @param coordA
     * @param coordB
     * @return
     */
    public static double distance(Coordinate coordA, Coordinate coordB) {
        return Math.sqrt(
                Math.pow((coordA.getX() - coordB.getX()), 2) +
                Math.pow((coordA.getX() - coordB.getX()), 2) +
                Math.pow((coordA.getX() - coordB.getX()), 2)
        );
    }

    /**
     *
     * @param coordA
     * @param coordB
     * @param coordC
     * @return coordinate of the centroid from three coordinates
     */
    public static Coordinate getBarycentre(Coordinate coordA, Coordinate coordB, Coordinate coordC) {
        double xA, yA, zA, xB, yB, zB, xC, yC, zC;
        double xG, yG, zG;

        xA = coordA.getX(); yA = coordA.getY(); zA = coordA.getZ();
        xB = coordB.getX(); yB = coordB.getY(); zB = coordB.getZ();
        xC = coordC.getX(); yC = coordC.getY(); zC = coordC.getZ();

        xG = (xA + xB + xC) / 3;
        yG = (yA + yB + yC) / 3;
        zG = (zA + zB + zC) / 3;

        return new Coordinate(xG, yG, zG);
    }

    /**
     *
     * @return a String representation of Coordinate
     */
    public String toString() {
        return "Coordinate [x="+x+", y="+y+", z="+z+"]";
    }
}
