package chapter06;

public class MultipleArrayTest01 {

	public static void main(String[] args) {
		
		// 3*3 => 3행 3열의 배열 생성
		
		int[][] matrix1 = new int[3][3];
		int[][] matrix2 = new int[3][];  //[] 사이가 비어 있을 수 있음
		matrix2[0] = new int[3];  
		matrix2[1] = new int[3];
		matrix2[2] = new int[3];
		
		int matrix3[][] = {{3,6,9}, {10,20,30}, {2,4,8}};
		
		matrix1[0][0] = 100;
		matrix1[2][1] = 500;
		
		//matrix1
		//첫번째 for 문 = 행
		for (int i = 0; i < matrix1.length; i++) {
			//두번째 for 문 = 열
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print("["+ i +","+ j +"] = " + matrix1[i][j]+"\t");	
			}
			System.out.println();
		}
		System.out.println();
		//matrix2
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print("["+ i +","+ j +"] = " + matrix2[i][j]+"\t");	
			}
			System.out.println();
		}
		System.out.println();
//		matrix3
		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3[i].length; j++) {
				System.out.print("["+ i +","+ j +"] = " + matrix3[i][j]+"\t");	
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
