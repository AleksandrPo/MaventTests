package lv.ctco.javaschool.anagram;

import java.util.List;
import java.util.Scanner;

public class Anagram {
    Scanner scan = new Scanner(System.in);

    public int factorial(int number, int factorial){
        if(factorial == 1){
            return number;
        }
        number = number * (number - factorial);
        factorial--;
        //factorial(number, factorial);
        return factorial(number, factorial);
    }

    public static void main(String[] args) {

        Anagram buf = new Anagram();
        String str = buf.scan.next();

        int wordLength = str.length();

        char[] in = new char[wordLength + 1];
        in = str.toCharArray();

        int number_of_words = buf.factorial(wordLength, wordLength);
        System.out.println(number_of_words);


        for(int i = 0; i < number_of_words; i++){
            for (int j = 1; j < str.length(); j++){
            }
            System.out.println(in[i]);
        }
    }
}