package chapter07;

public class Animal2 {
	//Field : 전역변수 (초기화 안해도 JVM이 알아서 초기화 해줌)
	String name;
	int age;
	
	//Constructor - 생성자는 오버로딩이 가능함!!
	public Animal2() { //기본 생성자
		//생성자 호출시 실행되는 내용 => new Animal(); 코드 실행 시 실행됨
		System.out.println("객체를 생성한다.");
	}

	public Animal2(String name) { //field의 name만 초기화
		//생성자 호출시 실행되는 내용 => new Animal(); 코드 실행 시 실행됨
		this.name = name;
		System.out.println("객체를 생성한다.");
	}

	public Animal2(String name,int age) { //field의 name만 초기화
		//생성자 호출시 실행되는 내용 => new Animal(); 코드 실행 시 실행됨
		this.name = name;
		this.age = age;
		System.out.println("객체를 생성한다.");
	}

	
	//Method
	public void sleep(){
		String date = "2025-07-03";
		System.out.println(name+"가(이)"+"잠을 잔다."+date);
		
	}
}
