package com.traveller.payment.services;

public class BubbleSortImpl {

	public void bubbleSort(int arr[]) {
	    int size = arr.length;
	    
	    for (int i = 0; i < (size-1); i++) 
	    {
	      for (int j = 0; j < ((size -1)- i); j++) 
	      {
	    	  // descending order
	    	  if (arr[j] < arr[j + 1])
	    	  {
	        	int temp = arr[j];
	        	arr[j] = arr[j + 1];
	        	arr[j + 1] = temp;
	    	  }
	      }
	      
	    }
	}

}
