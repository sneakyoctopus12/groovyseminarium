package emils.goodoldjava;

public class SumEvenNumbers {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i <= 10; i+=2) {
			sum += i;
		}
		
		System.out.println(sum);
	}
}
