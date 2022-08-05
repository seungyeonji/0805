
public class InheritanceDemo {
	public static void main(String[] args) {
		ThreeD td = new ThreeD();
		td.print();
	}
}

class TwoD{
	int x = 5, y = 10;
	public TwoD() {		//부모 생성자 -> 먼저 출력됨
		System.out.println("나는 TwoD");
	}
	void print() {
		System.out.printf("(x, y) = (%d, %d)\n", this.x, this.y);
	}
}

class ThreeD extends TwoD{	//상속됐으니까 td에서도 TwoD의 자원에 접근할 수 있다(내려받는게 아니라 접근권한의 개념)
	int z = 100;
	public ThreeD() {	//자식 생성자
		System.out.println("나는 ThreeD");
	}
}