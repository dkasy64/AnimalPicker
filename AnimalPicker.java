import java.util.Scanner;
public class AnimalPicker{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What animal would you like to see?");
        String choice = scan.nextLine();
        if(choice.equals("dog")){
            System.out.println("DOG ASCII ART HERE");
        } else if(choice.equals("cat")){
            System.out.println("CAT ASCII ART HERE");
        } else{
            System.out.println("Error");
        }  
    }
}