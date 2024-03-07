package lab1;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word = "";

        System.out.println("Enter a word: ");
        word = kb.nextLine();

        uniqueCharacters(word);
    }

    public static void uniqueCharacters(String test){
        String temp = "";
        for (int i = 0; i < test.length(); i++){
            char current = test.charAt(i);
            if (temp.indexOf(current) < 0){
                temp = temp + current;
            } else {
                temp = temp.replace(String.valueOf(current), "");
            }
        }

        System.out.println(temp + " ");

    }
}

