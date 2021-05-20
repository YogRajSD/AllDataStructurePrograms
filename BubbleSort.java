package SortingAlgorithms;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,30,5,2,11};
		int n=arr.length;
		disply(arr);
		BubbleSort(arr,n);
		disply(arr);
	}

	static void BubbleSort(int arr[],int n) {
		for(int i=n;i>0;i--) {
			for(int j=0;j<i-1;j++) {          // Here total passes required are n-1
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	static void disply(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
