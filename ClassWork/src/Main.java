
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Util util = new Util();
		util.maxElement();
		int mas1[] = util.getMas();
		for(int i = 0; i < mas1.length; i++)
			System.out.print(mas1[i] + " ");
		int sum = 0;
		sum = util.getSumBeforZero();
		System.out.println("\nСумма элементов массива до нуля: " + sum);
		int count = util.getNumberOfPositive();
		System.out.println("\nЧисло положительных элементов массива = " + count);
	}

}
