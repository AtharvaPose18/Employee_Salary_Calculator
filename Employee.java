import java.util.Scanner;
class EmployeeC{
    String name;
    double basicSalary,a,b;
    EmployeeC(String name,double basicSalary,double a,double b){
        this.name=name;
        this.basicSalary=basicSalary;
        this.a=a;
        this.b=b;
    }
    double calculateSalary(){
        double hra=basicSalary*a;
        double bonus=basicSalary*b;
        return basicSalary+hra+bonus;
    }
    void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name:"+ name);
        System.out.println("Basic Salary:Rs."+basicSalary);
        System.out.println("Total Salary:Rs."+calculateSalary());
    }
}
public class Employee{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter employee name:");
        String name=sc.nextLine();
        System.out.print("Enter basic salary:Rs.");
        double salary=sc.nextDouble();
        System.out.println("Enter HRA Percentage:");
        double hra=sc.nextDouble();
        System.out.println("Enter Bonus Percentage:");
        double bonus=sc.nextDouble();
        if (salary<0) {
            System.out.println("Invalid salary!");
        } else {
            EmployeeC e1=new EmployeeC(name,salary,hra,bonus);
            e1.displayDetails();
        }
        sc.close();
    }
}
