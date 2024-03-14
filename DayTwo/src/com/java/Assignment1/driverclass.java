package com.java.Assignment1;
import java.util.Scanner;
public class driverclass {
    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        Scanner sc = new Scanner(System.in);
        int empid, empage;
        long empnumber;
        String empname, empadd;
        
        System.out.println("For Default Constructor: ");
        System.out.println("Enter Employee's Id: ");
        empid = sc.nextInt();
        System.out.println("Enter Employee's Age: ");
        empage = sc.nextInt();
        System.out.println("Enter Employee's Phone Number: ");
        empnumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter Employee's Name: ");
        empname = sc.nextLine();
        System.out.println("Enter Employee's Address: ");
        empadd = sc.nextLine();
        
        e1.setEmployeeId(empid);
        e1.setAge(empage);
        e1.setEmployeeName(empname);
        e1.setEmployeeaddress(empadd);
        e1.setEmployeeNo(empnumber);
        
        System.out.println(e1);
        
        System.out.println("For Parameterized Construction");
        System.out.println("Enter Employee's Id: ");
        empid = sc.nextInt();
        System.out.println("Enter Employee's Age: ");
        empage = sc.nextInt();
        System.out.println("Enter Employee's Phone Number: ");
        empnumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter Employee's Name: ");
        empname = sc.nextLine();
        System.out.println("Enter Employee's Address: ");
        empadd = sc.nextLine();
        
        Employee e2 = new Employee(empid,empage,empname,empadd,empnumber);
        System.out.println(e2);
        sc.close();        
    }
}
