package OOP;

public class House {
    private String color;
    private int zipCode;
    private int numberOfDoors;
    private boolean hasGarage;
    private boolean isMobile;


    public House(String color, int zipCode, int numberOfDoors, boolean hasGarage) {
        this.color = color;
        this.zipCode = zipCode;
        this.numberOfDoors = numberOfDoors;
        this.hasGarage = hasGarage;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }


}
