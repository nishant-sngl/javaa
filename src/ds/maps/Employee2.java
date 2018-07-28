package ds.maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee2 implements Comparable<Employee2>{

	public String name;
	public int sal;
	public String dept;
	public int age;
	
	public Employee2(String name, int sal, String dept, int age) {
		this.name = name;
		this.sal = sal;
		this.dept = dept;
		this.age = age;
	}
	
	@Override
	public int compareTo(Employee2 o) {
		// TODO Auto-generated method stub
		return this.sal-o.sal;
	}
	
	public static void main(String[] args) {
		List<Employee2> e = new ArrayList<>();
		e.add(new Employee2("abc1", 11, "aut1", 2222));
		e.add(new Employee2("abc2", 14, "aut6", 1));
		e.add(new Employee2("abc3", 4, "aut2", 343));
		e.add(new Employee2("abc4", 1, "aut0", 121212));
		
		for(Employee2 emp : e){
			System.out.print(emp.age);
			System.out.print(" : ");
			System.out.print(emp.sal);
			System.out.print(" : ");
			System.out.print(emp.name);
			System.out.print(" : ");
			System.out.print(emp.dept);
			System.out.println();
		}
		
		Collections.sort(e);
		
		for(Employee2 emp : e){
			System.out.print(emp.age);
			System.out.print(" : ");
			System.out.print(emp.sal);
			System.out.print(" : ");
			System.out.print(emp.name);
			System.out.print(" : ");
			System.out.print(emp.dept);
			System.out.println();
		}
	}

}
