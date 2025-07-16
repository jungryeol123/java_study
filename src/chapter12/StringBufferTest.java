package chapter12;

public class StringBufferTest {

	public static void main(String[] args) {
		String str = "홍길동";
		str = str + "은 자바를";
		str = str + " 열심히 공부한다"; //접합연산자는 새로운 객체를 계속 만들어서 연산한다
		System.out.println(str);
		
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("홍길동");
		sb.append("은 자바를");
		sb.append(" 열심히 공부한다");
		
		System.out.println(sb.capacity());
		System.out.println(sb.toString());
		System.out.println(sb);
		
		
		
		
	}

}
