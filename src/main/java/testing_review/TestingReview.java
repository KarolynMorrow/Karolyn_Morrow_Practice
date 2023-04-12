package testing_review;

import java.util.StringJoiner;

public class TestingReview {
    public static void main(String[] args) {

//Code Question 1
        StringJoiner sj1 = new StringJoiner(";", "{", "}");
        StringJoiner sj2 = new StringJoiner(",", "[", "]");
        sj1.add("A").add("B");
        sj2.add("C").add("D");

        System.out.println(sj1); //{A;B}
        System.out.println(sj2);//[C,D]

        System.out.println(sj1.merge(sj2).toString());
        System.out.println(sj2.merge(sj1));




//Code Question 2
        StringBuffer sb = new StringBuffer("135");
        sb.replace(0, 4, "6789").insert(0, "12345"); //123456789
        //135 /= 6789 -- 123456789
        System.out.println(sb.reverse().delete(0, 5));
        //987654321...98765 Print--4321

//Code Question 3
        String E = "abc10";
        String T = "def20";
        String L = "pqr30";

        A obj = new A();
        obj.ETL(E + T + L);
        obj.ETL(E , T , L);
        obj.ETL();
    }

}



