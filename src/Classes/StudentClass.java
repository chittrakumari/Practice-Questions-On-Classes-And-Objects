/*
Q.Create a Student Class whose instance will represent name,rollNo,email,mobileNo.
Implement 100% encapsulation.
 */

package Classes;
public class StudentClass {
    //instance variables
    String name;
    String email;
    int rollNo;
    long mobileNo;

    public StudentClass(String name,String email,int rollNo,long mobileNo){
        this.name=name;
        this.email=email;
        this.rollNo=rollNo;
        this.mobileNo=mobileNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getEmail() {
        return email;
    }

    public long getMobileNo() {
        return mobileNo;
    }
}
