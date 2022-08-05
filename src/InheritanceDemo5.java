/*
 * 상속시 주의할점
 * 4. 같은 이름을 가진 리소스는 상속되지 않는다
 *   - overshadow 변수 : 같은 이름의 변수
 *   - override 메소드 : 같은 이름의 메소드
 */
public class InheritanceDemo5 {
	public static void main(String[] args) {
		Derived d = new Derived();
//		System.out.println(d.name); 	//접근주소가 자식이고, 자식클래스 갔는데 name이 있으니까 "박지민" 출력, 만약 name이 없으면 부모클래스의 name 출력
//		d.print(); //자식의 메소드가 출력
		d.display(); //굳이 "한지민" 찍고 싶으면 자식클래스에 super 사용해서 이름 출력하는 메소드 만들어주면됨
	}
}