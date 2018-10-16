package ds.maps;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Employee implements Comparator<Employee>{

	public String name;
	public int sal;
	public String dept;
	public int age;
	
	public Employee(String name, int sal, String dept, int age) {
		this.name = name;
		this.sal = sal;
		this.dept = dept;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	public static void main(String[] args) {
		Employee[] e = new Employee[4];
		e[0] = new Employee("abc1", 11, "aut1", 34);
		e[1]= new Employee("abc2", 12, "aut6", 33);
		e[2]= new Employee("abc3", 13, "aut2", 32);
		e[3]= new Employee("abc4", 14, "aut0", 31);
		
	
		Comparator<Employee> byAge = new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.age - o2.age;
			}
			
		};
		
		Comparator<Employee> bySal = new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.sal - o2.sal;
			}
			
		};
		
		Comparator<Employee> byName = new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o2.name.compareTo(o1.name);
			}
			
		};
		
		for(Employee emp : e){
			System.out.print(emp.getAge());
			System.out.print(" : ");
			System.out.print(emp.getSal());
			System.out.print(" : ");
			System.out.print(emp.getName());
			System.out.print(" : ");
			System.out.print(emp.getDept());
			System.out.println();
		}
		
		Arrays.sort(e, byName);
		
		for(Employee emp : e){
			System.out.print(emp.getAge());
			System.out.print(" : ");
			System.out.print(emp.getSal());
			System.out.print(" : ");
			System.out.print(emp.getName());
			System.out.print(" : ");
			System.out.print(emp.getDept());
			System.out.println();
		}
		
	}
*/
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
