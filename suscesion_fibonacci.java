public class suscesion_fibonacci {

    public static void main(String[] args) {

		int maxNumber = 50;
		long previousNumber = 0;
		long nextNumber = 1;
		System.out.print("susecion de fibonacci para el numero: " + maxNumber  );
		for (int i = 1; i <= maxNumber; ++i) {
			System.out.print(previousNumber + " ");

			long sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;

		}

	}
}
