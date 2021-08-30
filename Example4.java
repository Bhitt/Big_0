/* 
	What is the runtime?

	Similar to example 2, except now we have two different arrays.
*/

void printUnorderedPairs(int[] arrayA, int[] arrayB){
	for(int i = 0; i < arrayA.length; i++){
		for(int j = 0; j < arrayB.length; j++){
			if(arrayA[i] < arrayB[j]){
				System.out.println(arrayA[i] + "," + arrayB[j]);
			}
		}
	}
}

/*
	The runtime is O(ab). You can't say O(N^2) since we have two different inputs. This is a common
	mistake.
*/