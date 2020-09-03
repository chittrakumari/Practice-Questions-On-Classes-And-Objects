//It has the main function of Employee class.
package main;

//Importing Employee class from package Classes
import Classes.Employee;
import java.util.Arrays;
import java.util.Scanner;
public class EmployeeMain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Employee[] arr=new Employee[5];
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){

            //Creating a object of Employee class from package Classes.
            Employee object=new Employee();

            System.out.println("Enter firstname");
            object.setFirstName(sc.nextLine());
            System.out.println("Enter lastname");
            object.setLastName(sc.nextLine());
            System.out.println("Enter salary");
            object.setSalary(sc.nextInt());
            System.out.println("Enter employee id");
            object.setEmployeeid(sc.nextInt());
            System.out.println("Enter employee experience");
            object.setEmployeeExp(sc.nextInt());
            System.out.println("Enter mobile no");
            object.setMobileNo(sc.nextLong());
            sc.nextLine();
            System.out.println("Enter email");
            object.setEmail(sc.nextLine());
            arr[i]=object;

        }
        System.out.println("Details of employees");
        System.out.println(Arrays.toString(arr));
        Employee[] crr=sortSalaryOrder(arr);
        System.out.println("Sorted employee array on the basis of salary");
        System.out.println(Arrays.toString(crr));
        Employee[] err = sortExperienceOrder(arr);
        System.out.println("Sorted employee array on the basis of Experience");
        System.out.println(Arrays.toString(err));
    }

    //method to sort employee array on the basis of salary
    public static Employee[] sortSalaryOrder(Employee[] arr){
        Employee[] response = arr.clone();
        for (int i = 0; i < response.length; i++) {
            for (int j = 0; j < response.length - 1 ; j++) {
                if(response[j].getSalary() < response[j+1].getSalary()){
                    //swapping
                    Employee temp = response[j];
                    response[j] = response[j + 1];
                    response[j + 1] = temp;
                }

            }
        }
        return response;
    }

    //method to sort employee array on the basis of experience
    public static    Employee[]  sortExperienceOrder(Employee[] arr) {
        Employee[] drr = arr.clone();
        for (int i = 0; i < drr.length; i++) {
            for (int j = 0; j < drr.length - 1; j++) {

                if (drr[j].getEmployeeExp() < drr[j + 1].getEmployeeExp()) {
                    Employee temp = drr[j];
                    drr[j] = drr[j + 1];
                    drr[j + 1] = temp;
                }
            }
        }
        return drr;
    }

}
