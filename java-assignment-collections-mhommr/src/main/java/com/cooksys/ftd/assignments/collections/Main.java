package com.cooksys.ftd.assignments.collections;

import com.cooksys.ftd.assignments.collections.model.Employee;
import com.cooksys.ftd.assignments.collections.model.Manager;
import com.cooksys.ftd.assignments.collections.model.OrgChart;
import com.cooksys.ftd.assignments.collections.model.Worker;

public class Main {

    /**
     * TODO [OPTIONAL]: Students may use this main method to manually test their code. They can instantiate Employees
     *  and an OrgChart here and test that the various methods they've implemented work as expected. This class and
     *  method are purely for scratch work, and will not be graded.
     */
    public static void main(String[] args) {
    	
    	Worker worker1 = new Worker("Michael");
    	Manager man1 = new Manager("Will");
    	Manager man2 = new Manager("Kenny", man1);
    	Worker worker2 = new Worker("Johnny", man2);
    	Worker worker3 = new Worker("Sue", man2);
    	Worker worker4 = new Worker("Reed", man1);
    	Manager manless = new Manager("Ben");
    	
    	OrgChart orgChart = new OrgChart();
//    	System.out.println(orgChart.addEmployee(worker1));
//    	System.out.println(orgChart.addEmployee(man1));
//    	System.out.println(orgChart.addEmployee(man2));
//    	for (Employee emp : orgChart.getAllEmployees()) {
//    		System.out.print(emp.getName());
//    	}
//    	
    	System.out.println(orgChart.addEmployee(manless));
    	for (Employee emp : orgChart.getDirectSubordinates(manless)) {
    		System.out.println(emp.getName());
    	}
    	
    	
    	
    	    	
    }
    	
}
