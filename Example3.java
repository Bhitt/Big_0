/* 
	What is the runtime?

	This is similar to example 2, but the inner loops starts at i + 1.
*/

void printUnorderedPairs(int[] array){
	for(int i = 0; i < array.length; i++){
		for(int j = i + 1; j < array.length; j++){
			System.out.println(array[i] + "," + array[j]);
		}
	}
}

/*
	Counting the iterations

	The first time through j runs for N - 1 steps. The second time, it's N - 2 steps. And so on.

	Therefore, the total steps is:
		(N - 1) + (N - 2) + ... + 2 + 1

	The sum of 1 through N - 1 is N(N-1) / 2 . "Sum of Integers".

	So, the runtime be O(N^2).

	The matrix would look like 

	(0,1) (0,2) (0,3) .... (0,7)
		  (1,2) (1,3) .... (1,7)
		  			.
		  			.
		  			.
		  			  (5,6) (5,7)
		  					(6,7)

	Or half of an NxN matrix, which is roughly (N^2) / 2. So again, we get O(N^2).

	Average work is still roughly N/2 for the inner loop. So, the average case is still O(N^2).
*/