package OOP.pillars.encapsulation;

public class HumanBeing {
    private float height;
    private float weight;
    private float bmi;


    //---Constructor---

    public HumanBeing(float weight, float height, float bmi){
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
    }

    public HumanBeing(){

    }

    //--Getters and Setters

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getBmi() {
        return bmi;
    }

    public void setBmi(float bmi) {
        this.bmi = bmi;
    }


    //---Methods---


}
