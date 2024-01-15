import java.util.Scanner;
public class elseifelse01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        if(age >0 && age < 18 ){
            System.out.println("Teen");
        }else if (age > 18 && age <90){
            System.out.println("Human");
        }else{
            System.out.println("Yamraj");
        }
    }
}
