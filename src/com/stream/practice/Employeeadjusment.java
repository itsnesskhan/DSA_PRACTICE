package com.stream.practice;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	String jobtitle;
	long salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String jobtitle, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.jobtitle = jobtitle;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", jobtitle=" + jobtitle + ", salary=" + salary + "]";
	}

}

public class Employeeadjusment {

	public static Map<String, List<Employee>> groupByJobTitle(List<Employee> employeeList) {
//		  Map<String, List<Employee>> resultMap = new HashMap<>();
//		  for (int i = 0; i < employeeList.size(); i++) {
//		      Employee employee = employeeList.get(i);
//		      List<Employee> employeeSubList = resultMap.getOrDefault(employee.getJobtitle(), new ArrayList<Employee>());
//		      employeeSubList.add(employee);
//		      resultMap.put(employee.getJobtitle(), employeeSubList);
//		  }  
//		 return resultMap;
		return employeeList.stream()
	     .collect(Collectors.groupingBy(emp->emp.jobtitle)); // groupinbby work same as group by sql

		}
	
	public static double calcAvgSalary(List<Employee> employees) {
//		double salsum=0.0;
//		int count = 0;
//		for (Employee employee : employees) {
//			salsum+=employee.getSalary();
//			count+=1;
//		}
//		
//		 return salsum/count;
		return employees.stream().mapToLong(emp->emp.getSalary()).average().getAsDouble();
		 
	}
	
	
	public static void main(String[] args) {
		
		Employee employee = new Employee(1, "Nasser Khan", "System Engnieer", 30000);
		Employee employee1 = new Employee(2, "Hamda Khan", "Developer", 21000);
		Employee employee2 = new Employee(3, "Mohit Malve", "Business Analist", 25000);
		Employee employee3 = new Employee(4, "Shafan Mave", "Developer", 16000);
		Employee employee4 = new Employee(5, "Jaime Lennister", "System Engnieer", 25000);
		Employee employee5 = new Employee(6, "Jubiar Kaliya", "System Engnieer", 35000);
		
		List<Employee> emplist = Arrays.asList(employee,employee1,employee2,employee3,employee4,employee5);
		
		System.out.println("employee salary greater than 25000");
		emplist.stream().filter(emp->emp.getSalary()>25000).forEach(System.out::println);
		
//		Employee[] emplistEmployee  = new Employee[6];
//		Employee[] emplistEmployee  = {employee, employee1, employee2};
//		emplistEmployee[0] = employee;
		
//		HashMap<String,List<Employee>> map = new HashMap<>();
//		for (Employee emp : emplist) {
//			if (map.containsKey(emp.getJobtitle())) {
//				List<Employee> list = map.get(emp.getJobtitle());
//				list.add(emp);
//				map.put(emp.getJobtitle(), list );
//			}
//			else {
//				map.put(emp.getJobtitle(), new ArrayList<Employee>(Arrays.asList(emp)));
//				
//			}
//			
//			
//		}
//		
//		System.out.println(map);
//		Map<String, List<Employee>> collect = emplist.stream().collect(Collectors.groupingBy(f->f.getJobtitle()));
		
		
//		System.out.println(groupByJobTitle(emplist));
//		System.out.printf("%.2f", calcAvgSalary(emplist));
//		System.out.println("Rs.");
//		Stream<Long> map = emplist.stream().map(emp->emp.getSalary());
//		OptionalDouble average = emplist.stream().mapToLong(emp->emp.getSalary()).average();
//		double asDouble = emplist.stream().mapToLong(emp->emp.getSalary()).average().getAsDouble();
		
//		mapToLong.forEach(s->System.out.println(s));
//		map.forEach(m->System.out.println(m));
		
//		emplist.stream().mapToLong(e->e.getSalary()).average().getAsDouble();
	}

}
