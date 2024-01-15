import java.util.Scanner;
public class Switch_case {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int day = sc.nextInt();

      switch(day){
          case 1 :
              System.out.println("MOnday");
              break;
          case 2 :
              System.out.println("TU");
              break;
          case 3 :
              System.out.println("Wed");
              break;
          case 4 :
              System.out.println("Thu");
              break;
          case 5 :
              System.out.println("Fri");
              break;
          case 6 :
              System.out.println("Sat");
              break;
          case 7 :
              System.out.println("sun");
              break;
          default :
              System.out.println("LOL");
      }
    }
}
