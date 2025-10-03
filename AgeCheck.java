import java.util.Scanner;
public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        if(age<18){
            System.out.println("YOU ARE A MINOR.");
        } else{
            System.out.println("YOU ARE A ADULT.");
        }
    }
}
