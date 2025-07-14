package chapter08;

public class Animal extends Client{
	Person owner;
	String name;
	int age;
	
	public Animal() {
		this("예삐", 3 , null);
	}
	public Animal(String name, int age, Person owner) {
		this.name = name;
		this.age = age;
		this.owner = owner;
	}
	
	//method
	
	//sound
	public void sound() {
		System.out.println(name + " 짖는다");
		
	}
	
	//고객 정보 출력시 owner 정보 포함!!
	@Override
	public void printInfo() { 	
		System.out.print("고객(Animal)의 정보 =>");
		System.out.print(name + "," );
		System.out.print(age + ",");
		System.out.print(owner.name + "," );
		System.out.print(owner.age + "\n" );
	
	}
	@Override
	public void register() {
		System.out.println(owner.name + " 고객이 접수를 한다");
	}
	
	@Override
	public void payment() {}
	
	
	
	
	
	
}//class
