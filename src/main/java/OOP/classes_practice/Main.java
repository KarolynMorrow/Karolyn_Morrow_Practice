package OOP.classes_practice;

import OOP.classes_practice.Phone;

public class Main {
    public static void main(String[] args) {

        Phone iPhone12 = new Phone("apple", true, true);
        Phone oldPhone = new Phone("Motorola", false, false);
        iPhone12.ringTone();
        oldPhone.ringTone();

    }
}
