import java.util.Scanner;
public class AnimalPicker{
    public static void main(String[] args){
        boolean option = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("What animal would you like to see: a dog or cat or a fish?");
        while(option){
        String choice = scan.nextLine();
        if(choice.equals("dog")){
            System.out.println(" __/_  `.  .-\"\"\"-.\n \\_,` | \\-\'  /   )`-\')\n  \"\") `\"`    \\  ((`\"`\n ___Y  ,    .\'7 /|\n(_,___/...-` (_/_/");
            option = false;
        } else if(choice.equals("cat")){        
            System.out.println(" _._     _,-\'\"\"`-._\n(,-.`._,\'(       |\\`-/|\n    `-.-\' \\ )-`( , o o)\n          `-    \\`_`\"\'-");
            option = false;
        } else if(choice.equals("fish")){
            System.out.println("    /\"*._         _\n      .-*\'`    `*-.._.-\'/\n    < * ))     ,       ( \n      `*-._`._(__.--*\"`.\\");
            option = false;
        }
          else{
            System.out.println("Enter dog or cat ");

        }scan.close();
    }  
    }
}