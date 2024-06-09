import java.util.Scanner;
#BE4기_제갈근
public class Main {
    public static void main(String[] args) {

        System.out.print("<<<<메뉴선택>>>>\n1.회원 관리\n2.과목 관리\n3.수강 관리\n4.결제 관리\n5.종료");

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("메뉴의 번호를 입력하세요");
            String str = scan.nextLine();

            if (str.equals("1")) {
                System.out.println("회원 관리 메뉴를 선택했습니다.");
                if (str.equals("2")) {
                    System.out.println("과목 관리 메뉴를 선택했습니다.");
                }
                if (str.equals("3")) {
                    System.out.println("수강 관리 메뉴를 선택했습니다.");
                }
                if (str.equals("4")) {
                    System.out.println("결제 관리 메뉴를 선택했습니다.");
                }
                if (str.equals("5")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                else{
                    System.out.println("입력값이 정확하지 않습니다.");
                    }
                }
            }
        }
    }

