package core.comp;

import java.util.Arrays;
import java.util.Comparator;

public class Emp implements Comparator<Emp>{

	String name;
	int age;
	String company;
	int id;
	
	public Emp(String name, int age, String company, int id) {
		this.name = name;
		this.age = age;
		this.company = company;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public static void main(String[] args) {
		
		Emp[] e = new Emp[4];
		e[0] = new Emp("nishant1", 30, "bb", 0);
		e[1] = new Emp("nishant1", 31, "bb", 1);
		e[2] = new Emp("nishant2", 32, "bb", 2);
		e[3] = new Emp("nishant3", 33, "bb", 3);
		
		Arrays.sort(e, byAge);
	}

	public static Comparator<Emp> byAge = new Comparator<Emp>() {
		@Override
		public int compare(Emp o1, Emp o2) {
			// TODO Auto-generated method stub
			return o1.age-o2.age;
		}
	};

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
