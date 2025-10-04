import java.util.Scanner;
public class Grade{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks (0-100):");
        int mark=sc.nextInt();
        if (mark>=91){
            System.out.println("O");
        } else if(mark>=81){
            System.out.println("A");
        }   else if(mark>=71){
            System.out.println("C");
        }   else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
