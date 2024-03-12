package Arrays;

public class Max_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,21,25,78,99,45,34,76,27};
		int max = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println("Maximum element in the array is:" + max);
		

	}

}
