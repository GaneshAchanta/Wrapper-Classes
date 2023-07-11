package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharTest {

	public static void main(String[] args) throws IOException {
		char ch; //primitive type data
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //used to read keyboard values
		while(true) {
			System.out.println("Enter a character value");
			ch = (char)br.read(); //read character value from br and storing character variable
			System.out.println("You Entered...." +ch);
			if(Character.isDigit(ch)) //true, when character is digit
				System.out.println("A Digit");
			else if(Character.isUpperCase(ch)) //true, when character is upper case
				System.out.println("An Upper case character");
			
			else if(Character.isLowerCase(ch)) //true, when character is lower case
				System.out.println("A Lower case character");
			
			else if(Character.isSpaceChar(ch)) //true, when character is empty space
				System.out.println("Space bar character");
			
			else if(Character.isWhitespace(ch)){ //return true, when character is whitespace
				System.out.println("A Whitespace character");
				return;
			}
			else
				System.out.println("Sorry, I don't know that!");
			br.skip(2);//to skip \n code from br
		}

	}

}
