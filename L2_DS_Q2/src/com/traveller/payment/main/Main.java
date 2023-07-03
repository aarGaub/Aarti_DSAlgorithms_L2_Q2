package com.traveller.payment.main;

import java.util.Scanner;

import com.traveller.payment.services.BubbleSortImpl;
import com.traveller.payment.services.NotesImpl;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size of currency denominations ");
		
		int sizeOfCurrDenominations = sc.nextInt();
		
		System.out.println("Enter the currency denominations value ");
		
		int[] notes = new int[sizeOfCurrDenominations];
		
		for(int i=0; i<sizeOfCurrDenominations; i++) {
			
			notes[i]=sc.nextInt();
		}
		
		System.out.println("Enter the amount u want to pay");
		
		int amount = sc.nextInt();
		
		/*Bubble Sort -Simpler and better in terms of space complexity in this case.
		 * Notes denominations will always be a small set of data hence time complexity
		will not make much difference compared to merge sort on small sets of data */
		
		BubbleSortImpl sortedNotes = new BubbleSortImpl();
		sortedNotes.bubbleSort(notes);
		 
        NotesImpl noteCount = new NotesImpl();
        noteCount.notesCountImplementation(notes, amount);
        	
        sc.close();
	}

}
