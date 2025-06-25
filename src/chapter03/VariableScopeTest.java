package chapter03;

/*
 * 변수의 범위  설정 : Global(전역), Local(지역,로컬) 
 */
public class VariableScopeTest {
	
//	이 공간에 들어가야 전역 변수
	static int gnum = 10;
// 	전역 상수 : START, END
	static final int START = 1;
	static final int END = 0;
	
	public static void main(String[] args) {
		
		//main method의 지역 변수
		int num = 100;
		String str = new String("홍길동");
		String str2;  		//선언*
		
		
		{
			int num2 = 200;	
			str2 = "홍실순";	//할당*
			System.out.println("지역변수 "+num2);
			System.out.println("지역변수 "+str2);
		}
		
		
		
		System.out.println("전역변수 "+gnum);
		System.out.println("지역변수 "+num);
		System.out.println("전역상수 "+START);
		System.out.println("전역상수 "+END);
		System.out.println("참조변수 "+str);
	}
}
// Stack은 한정적이기 때문에 블럭이 끝나면 끝난 블럭에 있는 메모리는 삭제된다.
// Heap은 Stack과는 다르게 블럭이 끝난다고 삭제되지 않기 때문에 임계치에 다다르면 garbage collector가 Heap에 있는 메모리를 지워준다.