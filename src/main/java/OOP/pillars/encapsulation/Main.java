package OOP.pillars.encapsulation;

public class Main {
    public static void main(String[] args) {
        HumanBeing ricky = new HumanBeing();
        ricky.setHeight(1.65f);
        ricky.setWeight(68);
        ricky.setBmi(calculateBmi(ricky));

        System.out.println("Person has " + ricky.getWeight()+ " kgs and is " + ricky.getHeight()+ " " +
                "meters in height, which results in a BMI of " + ricky.getBmi());
    }

    public static float calculateBmi(HumanBeing humanBeing) {
        return humanBeing.getWeight()/(humanBeing.getHeight()* humanBeing.getHeight());
    }
}
