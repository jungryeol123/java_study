package chapter06;
/*
 * 향상된 for - 배열이나 컬렉션(List) 객체에 사용됨
 */
public class ArrayOfForTest {
	public static void main(String[]args) {
		int[] nList = {1,2,3,4,5};
		
		//일반적인 for문을 이용하여 출력
		for (int i = 0; i < nList.length; i++) {
			System.out.print(nList[i]+"\t");
		}
		System.out.println();
		
		//향상된 for문을 이용하여 출력 *JVM이 알아서 입력하는 방식 대신 데이터값을 바꿀 수 없음.(데이터를 출력하는 경우 사용)
		
		for (int number : nList) {
			System.out.print(number+"\t");
		}
		
		
		
		
		
		
		
		
		
	}
}
