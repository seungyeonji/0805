
public class ConstructorDemo {
	public static void main(String[] args) {
//		Car car = new Car();		//기본생성자가 없으니까 오류남
		Car car = new Car("Sonata", 30_000_000, "Hyundai Motors");
		System.out.println(car);	//car 대신 car.toString() 써도됨
	}
}

/*
 * 생성자의 역할은 멤버 변수 또는 멤버 상수의 초기화
 * 생성자를 통해서 또는 initialization block을 통해서 초기화한다
 */
