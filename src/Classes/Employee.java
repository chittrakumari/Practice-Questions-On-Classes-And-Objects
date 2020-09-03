/*
Q.Create a class Employee whose instances will represent following properties:firstName,lastname,salary,
employeeId,employeeExperience,MobileNo,email.

Create an array of employee instances of size 5 and intialize the array by instance of Employee,each
instance will have different state,kindly take user input for intializing each instance of Employee

After intialization of array arrange the array in order employee Salary.Then repeat to arrange the
array in order employee salary.Then repeat to arrange the array in order of experience.
 */

package Classes;
public class Employee {

    //instance variables
    String firstName;
    String lastName;
    int salary;
    int employeeid;
    int employeeExp;
    long mobileNo;
    String email;

    //getter and setter methods.
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getEmployeeid() {
        return employeeid;
    }


    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public int getEmployeeExp() {
        return employeeExp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setEmployeeExp(int employeeExp) {
        this.employeeExp = employeeExp;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String toString(){
        return "\n"+firstName+","+lastName+","+salary+","+employeeid+","+employeeExp+","+mobileNo+","+email ;
    }


}
