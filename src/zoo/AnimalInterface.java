package zoo;
/**
 * 동물의 공통적인 행위
 * sleep(),eat()
 */
public interface AnimalInterface {
	//인터페이스는 바디가 없음
	public void sleep();
	public void eat();
	public String getName();
	public int getAge();
}
