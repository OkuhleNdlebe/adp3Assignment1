package za.ac.cput.adp3assignment1;

/**
 * Author: Lindokuhle Nini
 * Student number: 218196504
 * This class is going to calculate the volume of a cylinder
 */
public class MathUtilis {

    public double computeCylinderVolume(double radius, double height){
        return Math.PI * radius*radius * height;
    }

    public double computeRectangleVolume(double length, double height, double width){
        return length * height * width;
    }

    public double computeSphereVolume(double radius){
        return (4.0/3.0) * Math.PI * (radius * radius * radius);
    }



}
