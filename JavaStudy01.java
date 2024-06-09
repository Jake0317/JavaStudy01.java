public class StandardIO {
	public static void main(String[] args) throws IOException {

   //int를 입력 받을 때는 nextInt 메서드를 이용한다.
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a+" "+b);
	}
}

