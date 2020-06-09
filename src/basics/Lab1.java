package basics;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5, -2, 0, 234, -438, 64};
//		System.out.println(numbers[0]);
		System.out.println("Min number of array numbers is: " + findMin(numbers));
		System.out.println("Max number of array numbers is: " + findMax(numbers));
		System.out.println("Average number of array numbers is: " + findAvg(numbers));

		
	}	
	public static int  findMin(int[] arr) {
		int min = arr[0];
		for(int i =  0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static int  findMax(int[] arr) {
		int max = arr[0];
		for(int i =  0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static int findAvg(int[] arr) {
		int sum = 0;
		for(int i =  0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum: " + sum);
		return sum / arr.length;
	}
}


