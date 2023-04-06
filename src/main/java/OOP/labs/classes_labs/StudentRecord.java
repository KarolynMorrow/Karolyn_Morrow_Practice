package OOP.labs.classes_labs;

public class StudentRecord {
/*
[In-Class Lab exercise: Create StudentRecord class ]
Define “StudentRecord” class with the following fields - determine whether each of these fields should “instance variable” field or “static variable” field - assign proper type
studentCount
name
mathScore
scienceScore
algebraScore
Add getter and setter methods of the above fields
Add a method that returns total number of students
Add a method that computes average score from the 3 scores for a particular student
Create Main class as following:
Create 2 “StudentRecord” object instances
For creating and initializing a “StudentRecord” object instance, use “setter” methods defined above
Display number of students
Display each student’s name and average score

[In-Class Lab exercise: Method overloading]
Refactor the “StudentRecord” class to add the following two overloaded “print(..)” methods
public void print(String name)
public void print(String name, double averageScore)
Refactor “Main” class above to use the above methods appropriately

[In-Class Lab exercise: Constructors]
Refactor “StudentRecord” class to add multiple constructors
A constructor that takes one argument of “name”
A constructor that takes 2 arguments of “name” and “mathScore”
A constructor that takes 4 arguments of “name”, “mathScore”, “scienceScore”, and “algebraScore”
For the constructors that takes 2 arguments and 4 arguments, use “this(..)” method appropriately
Refactor “Main” class to use these instructors instead of setter methods when creating “StudentRecord” object instances
*/
//-----Fields-------
    private String studentName;
    private double mathScore;
    private double scienceScore;
    private double algebraScore;
    private static int studentCount;

    //-----Constructors (are invoked each time an object of class (new Class) is made)----
    public StudentRecord() {
        studentCount++;
    }

    public StudentRecord(String studentName) {
        this.studentName = studentName;
        studentCount++;
    }

    public StudentRecord(String studentName, double mathScore) {
        this.studentName = studentName;
        this.mathScore = mathScore;
        studentCount++;
    }

    public StudentRecord(String studentName, double mathScore, double scienceScore, double algebraScore) {
        this.studentName = studentName;
        this.mathScore = mathScore;
        this.scienceScore = scienceScore;
        this.algebraScore = algebraScore;
        studentCount++;
    }

    //-----Getters and Setters


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getScienceScore() {
        return scienceScore;
    }

    public void setScienceScore(double scienceScore) {
        this.scienceScore = scienceScore;
    }

    public double getAlgebraScore() {
        return algebraScore;
    }

    public void setAlgebraScore(double algebraScore) {
        this.algebraScore = algebraScore;
    }

    //-------Class methods------
    public static int getNumberOfStudents() {
        return studentCount;
    }

    public double getStudentAverage() {
        double studentAverage;
        studentAverage = (algebraScore + scienceScore + mathScore) / 3;
        return studentAverage;
    }

    public void print(String studentName) {
        System.out.println(getStudentName() + " is taking classes at boating school");
    }


    public void print(String studentName, double studentAverage) {
        System.out.printf(getStudentName() + " has an average of %.2f\n", getStudentAverage());
    }

    public static void currentStudents() {
        if (StudentRecord.getNumberOfStudents() == 1) {
            System.out.println("There is currently 1 student on record.");
        } else if (StudentRecord.getNumberOfStudents() > 1){
            System.out.println("There are currently " + StudentRecord.getNumberOfStudents() + " students on record.");
        } else {
            System.out.println("There are no students on record.");
        }
    }

}

