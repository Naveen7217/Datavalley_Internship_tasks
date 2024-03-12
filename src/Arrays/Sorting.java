package Arrays;

public class Sorting {
	
	public void sort_array(int[] arr)
	{
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
	
	public int count_occurence(int arr[],int value){
        int count = 0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i] == value)
            {
                count++;
            }
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,14,32,7,21,67,89,56,8,7,14,5,3,7,32};
        Sorting p1 = new Sorting();
        p1.sort_array(arr);
        int c = p1.count_occurence(arr,7);
        System.out.println("No of occurence of 7 is "+c);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

	}

}
