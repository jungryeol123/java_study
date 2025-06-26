package chapter04;
/*
 * 증감 연산자 : ++, --
 */
public class OpIncrementTest {
	public static void main(String[] args) {
		
		int num = 10;
		System.out.println(++num); //바로 1증가 후 화면 출력
		System.out.println(num++); //화면에 num값을 먼저 보여준 후 1증가
		System.out.println(num);   //메모리에는 위↑ 코드 단계 때문에 11에서 1증가해 있기 때문에 화면에는 11로 보여도 사실 12가 저장되어 있다.
		
		System.out.println(--num);
		System.out.println(num--);
		System.out.println(num);
	}
}
