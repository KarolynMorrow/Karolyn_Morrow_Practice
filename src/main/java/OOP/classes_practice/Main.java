package OOP.classes_practice;

import OOP.classes_practice.Phone;

import static OOP.classes_practice.Phone.phoneBreakdown;

public class Main {
    public static void main(String[] args) {

        Phone iPhone12 = new Phone("apple", true, true, 6.5, "Rear and front", "Apple brand");
        Phone oldPhone = new Phone("Motorola", false, false, 4.2, "None", "c port");


        iPhone12.ringTone();
        oldPhone.ringTone();


        Phone.protectionPlan(iPhone12);
        phoneBreakdown(oldPhone);

    }
}
