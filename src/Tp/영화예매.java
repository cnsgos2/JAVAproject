package Tp;


import java.util.Scanner;
public class 영화예매 {   
   public static void main(String[] args) {
      

              Scanner scanner = new Scanner(System.in);
              MemberManager memberManager = new MemberManager(100);
              boolean isRunning = true;
              
              while (isRunning) {
            	 
            	  printMainMenu();
                  int menu = Integer.parseInt(scanner.nextLine());
                  
                  switch (menu) {
                   case 1:
                       memberManager.registerMember(scanner);
                       break;
                   case 2:
                       Member loginMember = memberManager.loginMember(scanner);
                        if (loginMember != null) {
                            System.out.println(loginMember.getName() + "님, 환영합니다!");
                            loginMenu(scanner);
                        } else {
                            System.out.println("로그인에 실패하였습니다.");
                        }
                       
                       break;
                   case 3:
                       isRunning = false;
                       break;
                   default:
                       System.out.println("잘못된 메뉴 선택입니다 다시 한번 입력해주세요.");
                       break;
               }
        }
   }
   
    private static void printMainMenu() {
       System.out.println("---------------------");
       System.out.println("안녕하세요 CGV입니다.\n");
       System.out.println("1. 회원 가입");
       System.out.println("2. 로그인");
       System.out.println("3. 종료");
       System.out.println("---------------------");
       System.out.print("메뉴 선택> ");
    }
    
    private static void printLogInMenu() {
        System.out.println("---------------------");
        System.out.println("1. 영화 랭킹");
        System.out.println("2. 영화 예매");
        System.out.println("3. 뒤로 가기");
        System.out.println("---------------------");
        System.out.print("메뉴 선택> ");
    }
 
    private static void loginMenu(Scanner scanner) {
           MovieManager movieManager = new MovieManager();
           boolean loginMenu = true;
           
          
           while (loginMenu) {
        	   
        	   printLogInMenu();
               int loggedInOption = Integer.parseInt(scanner.nextLine());

               switch (loggedInOption) {
                   case 1:
                      movieManager.MovieRankings();
                       break;
                   case 2:
                      movieManager.makeReservation(scanner);
                       break;
                   case 3:
                       loginMenu = false;
                       break;
                   default:
                       System.out.println("잘못된 메뉴 선택입니다  다시 한번 입력해주세요.");
                       break;
               }
           }
    }
}