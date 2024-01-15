import java.util.Scanner;
public class ifelseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num %2 == 0){
            System.out.println("True");
        }else if (num %4 == 1){
            System.out.println("False");
        }else{
            System.out.println("LOL");
        }
    }
}
