
public class Util {
	public int[] getMas(){
		int mas[] = {34,34,5,3,7,8,12,5,9,7,10,54,43,12,6};
		return mas;
	}
	public int[] getMasRandom(){
		int mas [] = new int[15];
		for(int i = 0; i<mas.length; i++)
			mas[i] = (int)(Math.random() * 10 + 1);
		return mas;
	}
	public void maxElement(){
		int mas [] = new int[10];
		System.out.println("Исходный массив:");
		for(int i = 0; i<mas.length; i++){
			mas[i] = (int)(Math.random() * 10 + 1);
			System.out.print(" " + mas[i]);
		}
		int max = mas[0];
		int index = 0;
		for (int i = 1; i < mas.length; i++){
			if (mas[i] > max){
				max = mas[i];
				index = i+1;
			}
		}
		System.out.println("");
		System.out.println("Максимальный элемент массива = " + max);
		System.out.println("Индекс максимального элемента массива = " + index);
	}
	public int getSumBeforZero(){
		int mas [] = new int[10];
		System.out.println("\nИсходный массив:");
		for(int i = 0; i<mas.length; i++){
			mas[i] = (int)(Math.random() * 10);
			System.out.print(" " + mas[i]);
		}
		int sum = 0;
		for (int i = 0; i < mas.length; i++)
			if (mas[i] == 0)
				break;
			else 
				sum += mas[i];
		return sum;
	}
	public int getNumberOfPositive(){
		int mas [] = new int[10];
		System.out.println("\nИсходный массив:");
		for(int i = 0; i<mas.length; i++){
			mas[i] = (int)(Math.random() * 10 - 5);
			System.out.print(" " + mas[i]);
		}
		int count = 0;
		for (int i = 0; i < mas.length; i++)
			if (mas[i] > 0)
				count++;
		return count;
	}
}
