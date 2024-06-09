public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("<<<<메뉴선택>>>>")
		System.out.print("1.회원 관리")
		System.out.print("2.과목 관리")
		System.out.print("3.수강 관리")
		System.out.print("4.결제 관리")
		System.out.print("5.종료")

	   	int num = input.nextInt();
		if (num = 1) {
			System.out.println("회원 관리 메뉴를 선택했습니다.");}
		if (num = 2) {
			System.out.println("과목 관리 메뉴를 선택했습니다.")}
		if (num = 3) {
			System.out.println("수강 관리 메뉴를 선택했습니다.")}
		if (num = 4) {
			System.out.println("결제 관리 메뉴를 선택했습니다.")}
		if (num = 5) {
			System.out.println("프로그램을 종료합니다.")}
		else {
			System.out.println("입력값이 정확하지 않습니다.")}
			}
}

