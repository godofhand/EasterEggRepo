import java.util.Scanner;

public class EEmain {

	public static void main(String[] args) {
		System.out.println("Program is running. ")
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("Type c c s to trigger an Easter Egg");
		boolean bingo = false;
		do {
			char first = stdIn.nextChar();
			char second = stdIn.nextChar();	
			char third = stdIn.nextChar();
			if (first == 'c' && second == 'c' && third = 's') {
				bingo = true;
			} else {
				bingo = false;
			}
		} while (bingo = false);
		display();

	}
	
	private void display() {
		System.out.println("The Crazy Code Surgeons - CCS");
		
		
	}


}
