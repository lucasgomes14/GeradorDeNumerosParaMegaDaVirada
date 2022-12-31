import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de números que você irá apostar: ");
		int quantity = sc.nextInt();
		generationNumbers generationNumbers = new generationNumbers(quantity);

		generationNumbers.generation();
	}
}
