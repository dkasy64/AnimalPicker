import java.util.Scanner;
public class AnimalPicker{
    public static void main(String[] args){
        boolean option = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("What animal would you like to see: a dog or cat?");
        while(option){
        String choice = scan.nextLine();
        if(choice.equals("dog")){
            System.out.println("DOG ASCII ART HERE");
            option = false;
        } else if(choice.equals("cat")){
            System.out.println("CAT ASCII ART HERE");
            option = false;
        } else{
            System.out.println("Enter dog or cat");
        }
    }  
    }
}