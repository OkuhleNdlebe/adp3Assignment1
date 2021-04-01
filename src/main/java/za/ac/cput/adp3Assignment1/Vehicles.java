package za.ac.cput.adp3Assignment1;

/**
 * Author:Vuyisa Nkangana(218192215)
 *
 * This program displays car make and brand
 */


public class Vehicles {
    private String make, brand;

    public String getMake() {

        return make;
    }

    public void setMake(String make) {

        this.make = make;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "make='" + make + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

}
