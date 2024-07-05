package com.techlabs.composite.solution.example.test;
import com.techlabs.composite.solution.example.model.Developer;
import com.techlabs.composite.solution.example.model.EmployeeDirectory;
import com.techlabs.composite.solution.example.model.Manager;
public class Demo {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Ramesh", "Senior Developer");
        Developer dev2 = new Developer("kamalesh", "Junior Developer");
        
        Manager mgr1 = new Manager("Praveen", "Project Manager");

        EmployeeDirectory engineeringDirectory = new EmployeeDirectory();
        engineeringDirectory.addEmployee(dev1);
        engineeringDirectory.addEmployee(dev2);

        EmployeeDirectory managementDirectory = new EmployeeDirectory();
        managementDirectory.addEmployee(mgr1);

        EmployeeDirectory companyDirectory = new EmployeeDirectory();
        companyDirectory.addEmployee(engineeringDirectory);
        companyDirectory.addEmployee(managementDirectory);

        companyDirectory.showEmployeeDetails();
    }
}
