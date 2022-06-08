import java.util.Scanner;

public class main {
    Scanner scan = new Scanner(System.in);
    public static void main(String[]args){
        int letters_num = Intro();
        int dif_num = Intro_difficultly();
        word(letters_num, dif_num);
        String user_guess = chart(letters_num);
        userInputArray(user_guess);
    }
    public static String word(int len_word, int dif_number){
        String[] five_letter = {};
        String[] dif_one = {}; // top row only
        String[] dif_two = {}; // top+mid row only
        String[] dif_three = {}; // top+mid+bot row only 

        if (len_word == 5){

        }
        return "test";
    }  

    public static int Intro(){
        Scanner scan = new Scanner(System.in);
        System.out.println("here is a bunch of bs stroy");
        // make it so the user iputs the numbers
        return 5;
    }   
    public static int Intro_difficultly(){
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter your diffiucly: ");
        // make it so the user iputs the numbers
        return 5;
    }   

    public static String chart(int letters){
        Scanner scan = new Scanner(System.in);
        // for loop that loops through and prints out the chart depending on the amount of letters

        System.out.println("Enter your first guess");
        String user_guess = scan.nextLine();

        return user_guess;
    }

    public static String[] userInputArray(String userInput){
        Scanner scan = new Scanner(System.in);

    
    }
}
