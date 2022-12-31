import java.util.Scanner;

public class App {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de números que você irá apostar: ");
		int quantity = sc.nextInt();
		GenerationNumbers generationNumbers = new GenerationNumbers(quantity);

		generationNumbers.generation();
	}
}