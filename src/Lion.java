
public class Lion extends Mammal{
	private int age;

//	public Lion(int age) {	//생성자
//									//mammal 을 상속받으니까 생성자에서 오류남 -> 생성자는 상속이 안되기 때문
//									//이 문제 해결하기 위한 방법 1 : 부모쪽(mammal)에 기본생성자 만들어준다
//									//기본생성자 안만들고 방법 2 : super(); 써준다 -> new 없이 부모 생성자 호출
////		super("한지민");		//자식 클래스 생성자는 부모 클래스의 기본생성자"만" 호출함 -> 다른 생성자 호출할때 super()를 쓰고 mammal(부모) 생성자는 name이 필요하니까 "한지민" 입력
////		this.age = age;		//super 메소드는 this 메소드처럼 반드시 첫번째 줄에 와야함, 또 super메소드랑 this메소드를 같이 쓸수는 없음
//	}
	
	//위 코드를 수정
	public Lion(String name, int age) {	//String name을 추가하고
		super(name);	//여기 name을 넣어줌
		this.age = age;
	}
	
	@Override
	public String toString() {	//재정의니까 헤더 건드리면 안됨
		return "이름은 " + getName() + ", 나이는 " + this.age;	//부모 클래스에서 getter 만들어줌 
	}
	
	
}
