
public class Mammal extends Object{	//모든 클래스는 extends Object 하니까 지금까지 생략했던거임(자동으로 들어오니까)
	private String name;
//	public Mammal() {}	//기본생성자
	public Mammal(String name) {	//생성자
		this.name = name;
	}
	
	public String getName() { //아무리 부모자식 관계지만 Lion의 toString에서 private 변수인 name에 접근하지 못함 -> 이름 받아오는 getter 필요
		return this.name;
	}
	
}
