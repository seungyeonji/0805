
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Manager m = new Manager();
		Employee e = new Employee();
//		System.out.println(m.salary);
//		System.out.println(e.name);
		System.out.println(e.salary); 		//상속(e가 salary 사용 -> 자식주소 입력)
	}
}

//cf. 자바는 절차적언어가 아니기 때문에 순서 중요하지 않음
class Manager{
	int salary = 1000000;
}
class Employee extends Manager{
	String name = "한지민";
}

//class Manage extends String{		//class가 final이면 상속받을 수 없다 -> public final class String 이기 때문에
//	int salary = 1000000;
//}