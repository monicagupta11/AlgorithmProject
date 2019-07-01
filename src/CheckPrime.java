public class CheckPrime {

	public static void main(String[] args) {

		int n = 29;
		boolean isPrime = checkPrime(n);
		System.out.println(isPrime);

	}

	static boolean  checkPrime(int n) {

		for (int i = 2; i < n / 2; i++) {

			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}
