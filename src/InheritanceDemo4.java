/*
 * 상속시 주의할 점
 * 3. static에 주의하자
 *		: static은 상속과 관련이 없다
 */
public class InheritanceDemo4 {
	public static void main(String[] args) {
		Sub sub = new Sub();
		System.out.println("국어 점수는 " + sub.kor);
		System.out.println("영어 점수는 " + sub.eng);
		System.out.println("영어 점수는 " + Super.eng);	//static은 클래스 이름으로 접근하니까 바로 윗줄처럼 자식 주소가 필요하지 않음(상속의 전제조건 : 자식 주소로 접근)
	}
}
