package za.ac.cput.oop.polymorphism;

/**
 * Created by tmoshasha on 04/27/2017
 */
public class MainStudent {

    public static void main(String args[])
    {
        Student stud = new Student();
        System.out.print(stud.job());

        Student j = new StudentJob();

        System.out.print(j.job());

    }
}
