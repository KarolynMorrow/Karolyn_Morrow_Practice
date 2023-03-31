package OOP.classes_labs;

public class Main {
    public static void main(String[] args) {
 /*Static methods do not rely on object information to run. They are given information to work with.
 Instance methods rely on information inside objects to run
 * Static methods -> Class.add(x,y);
 *Instance methods => car.getNumberOfWheels();*/

        //----Phone class practice-----

//        Phone iPhone12 = new Phone("apple", true, true, 6.5, "Rear and front", "Apple brand");
//        Phone oldPhone = new Phone("Motorola", false, false, 4.2, "None", "c port");
//
//
//        iPhone12.ringTone();
//        oldPhone.ringTone();
//
//
//        Phone.protectionPlan(iPhone12);
//        phoneBreakdown(oldPhone);

        //---StudentRecord class practice----


        StudentRecord spongebobRecord = new StudentRecord("SpongeBob Squarepants", 82.5, 89.2, 79.2);
        StudentRecord patrickRecord = new StudentRecord("Patrick Star", 55.2, 67.7, 48.5);
        StudentRecord sandyRecord = new StudentRecord("Sandy Cheeks", 110, 99, 98.2);
        StudentRecord squidwardRecord = new StudentRecord("Squidward Tentacles");
        StudentRecord krabsRecord = new StudentRecord("Krabs Moneybags", 99.7);

//        spongebobRecord.setStudentName("SpongeBob Squarepants");
//        spongebobRecord.setAlgebraScore(82.5);
//        spongebobRecord.setMathScore(89.2);
//        spongebobRecord.setScienceScore(79.2);
        //System.out.printf(spongebobRecord.getStudentName() + " has an average of %.2f\n", spongebobRecord.getStudentAverage());
        spongebobRecord.print(spongebobRecord.getStudentName(), spongebobRecord.getStudentAverage());
        spongebobRecord.print(spongebobRecord.getStudentName());


//        patrickRecord.setStudentName("Patrick Starr");
//        patrickRecord.setAlgebraScore(55.2);
//        patrickRecord.setMathScore(67.7);
//        patrickRecord.setScienceScore(48.5);
        //System.out.printf(patrickRecord.getStudentName() + " has an average of %.2f\n", patrickRecord.getStudentAverage());
        patrickRecord.print(patrickRecord.getStudentName(), patrickRecord.getStudentAverage());
        patrickRecord.print(patrickRecord.getStudentName());


//        sandyRecord.setStudentName("Sandy Cheeks");
//        sandyRecord.setScienceScore(110);
//        sandyRecord.setMathScore(99);
//        sandyRecord.setAlgebraScore(98);
        //System.out.printf(sandyRecord.getStudentName() + " has an average of %.2f\n", sandyRecord.getStudentAverage());
        sandyRecord.print(sandyRecord.getStudentName(), sandyRecord.getStudentAverage());
        sandyRecord.print(sandyRecord.getStudentName());


        StudentRecord.currentStudents();


    }


}
