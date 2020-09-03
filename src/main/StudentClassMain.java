
//It has the main function of Student class.
package main;

//Importing StudentClass class from package Classes
import Classes.StudentClass;
import java.util.Scanner;

public class StudentClassMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creating a object of StudentClass class from package Classes to call the parametrized constructor.
        StudentClass object = new StudentClass(sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextLong());

        System.out.println("name: "+object.getName());
        System.out.println("email: "+object.getEmail());
        System.out.println("mobileNo: "+object.getMobileNo());
        System.out.println("rollNo: "+object.getRollNo());


    }

}
