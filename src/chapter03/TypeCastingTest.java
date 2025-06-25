package chapter03;
/*
 * 형변환 : 자동(묵시적) 형변환, 강제(명시적) 형변환
 */
public class TypeCastingTest {

	public static void main(String[] args) {
		//자동(묵시적) 형변환 : 작은 데이터 타입 > 큰 데이터 타입
		byte bdata = 1;
		short sdata = bdata;
		int idata = sdata;
		long ldata = idata;
		
		int inum = 100;
		float fnum = inum;
		char str = 'A';
		int istr = str;
		
		//강제(명시적) 형변환 : 큰 데이터 타입 < 작은 데이터 타입
		int inumber = 120;
		byte bnumber = (byte)inumber;
		
		double dnumber = 12345.37;
		int inumber2 = (int)dnumber;
		
		System.out.println("-- 자동 형변환 --");
		System.out.println(ldata);
		System.out.println(fnum);
		System.out.println(istr);
		System.out.println("-- 강제 형변환 --");
		System.out.println(bnumber);
		System.out.println(inumber2);
	}
	

}
