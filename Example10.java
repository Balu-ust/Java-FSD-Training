package com.ust.example;
/*
 * 
 * array
 * 
 */
public class Example10 {
     
	public static void displayArray(int a[]) {
		
		for(int i:a) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /* int arr[]= new int[5];
     arr[0]=5;
     arr[1]=7;
     arr[2]=11;
     arr[3]=13;
     arr[4]=17;
   */
		
	//	int arr[]= {1,5,7,9,24};
    // for(int i=0;i<arr.length;i++)
	//	{
		//for(int i : arr)
    	 //System.out.println(i);
     //}
		displayArray(new int[]{4,6,8,12,17});
     
	}

}
