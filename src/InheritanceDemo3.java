/*
 * 상속시 주의할 점
 * 2. private은 상속되지 않는다
 */
public class InheritanceDemo3 {
	public static void main(String[] args) {
		Sparrow sp = new Sparrow(10);
//		System.out.println(sp.name);	//오류 -> private은 상속되지 않는다
	}
}
