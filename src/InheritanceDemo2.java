/*
 * 상속시 주의할 점 4가지
 * 1. 생성자는 상속되지 않는다
 * 	  - 자식 생성자는 항상 부모의 기본 생성자만 호출하기 때문이다
 *   - 만일 부모의 기본생성자가 없다면 에러가 발생하고, 에러를 해결하기 위해
 *   - 1) 부모의 기본생성자를 명시적으로 표현하거나 2) super()를 사용한다
 *   - super() 주의할점 : 생성자 안에서만 사용해야하고, 반드시 생성자에서 첫줄에 와야한다
 * 
 */
public class InheritanceDemo2 {
	public static void main(String[] args) {
		Lion lion = new Lion("Lion King", 26);
		System.out.println(lion);		//lion.toString 해줘도 되고 그냥 lion 해도됨
	}
}


