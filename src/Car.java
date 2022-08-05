import java.util.Date;

public class Car {
	private String name;
	private int price;
	private String maker;
	private Date today;
	private final double PI;	//상수는 final 붙여줘야함
	//private final double PI = 3.141596;	//원래는 이렇게 해야하지만 자바는 이런거 싫어함 -> 생성자에서 초기화해주던지, initialization block에서 초기화하면됨
	
	public Car(String name, int price, String maker) {		//파라미터가 있는 생성자 만들어주기
		this.name = name;
		this.price = price;
		this.maker = maker;
//		this.PI = 3.141596;
		System.out.println("방금 객체가 생성되었습니다");
	}
	
	
	
	//initialization block (초기화 블럭) : 이름도 없이 그냥{}만 써줌, 
	//-> 생성자를 통해서 멤버변수 초기화할수 있는데, 생성자 쓰려면 파라미터 넣어줘야함 그런데 초기화 블럭은 파라미터 필요없음
	//객체를 메모리에 로딩할때 단 한번!!!만 실행(이름 없으니까 호출하고싶어도 할 수 없음)
	//멤버변수 초기화를 제외한 나머지 변수 초기화하는 역할
	//생성자보다 더 먼저 실행돼서 출력됨
	{
		System.out.println("Hello, World");
		this.today = new Date();		//자동차의 제작년도가 아님->today는 자동차랑 관계없는 변수니까 굳이 생성자로 값을 줄 필요가 없다 -> initialization block 사용
		this.PI = 3.141596;
	}
	
	
	@Override		//컴파일러에게 부모의 toString을 재정의 했다고 알려줄때 쓰는 annotation
	public String toString() {
		return "오늘은 " + this.today + "입니다";	//String은 누구든지랑 + 하면 자동으로 전체가 String으로 변환됨
	}
	
}
