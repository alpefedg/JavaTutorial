package miniProjeAsalSayý;

public class Main {

	public static void main(String[] args) {

		int number = 25;
		int remainder = number % 2;
		boolean isPrime = true;
		System.out.println(remainder);

		if (number == 1) {
			System.out.println("Sayý asal deðildir.");
		}
		if (number < 1) {
			System.out.println("Geçersiz sayý");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;

			}

			if (isPrime) {
				System.out.println("Sayý asaldýr");
			} else {
				System.out.println("Sayý asal deðildir");
			}
		}

	}

}
