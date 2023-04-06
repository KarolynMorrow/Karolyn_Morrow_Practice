package OOP.labs.inheritance_labs;

public class Phone {
    private String brand;
    private double phoneNum;
    private String phoneChargerType;
    private String ringTone;


    public Phone(){

    }

    public Phone(String brand) {
        this.brand = brand;
    }

    public Phone(String brand, double phoneNum, String phoneChargerType) {
        this.brand = brand;
        this.phoneNum = phoneNum;
        this.phoneChargerType = phoneChargerType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(double phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPhoneChargerType() {
        return phoneChargerType;
    }

    public void setPhoneChargerType(String phoneChargerType) {
        this.phoneChargerType = phoneChargerType;
    }

    public String getRingTone() {
        return ("Bzzzt bzzzt");
    }

    public void setRingTone(String ringTone) {
        this.ringTone = ringTone;
    }
}
