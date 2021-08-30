/*
	What is the runtime of this strange code?
*/

void printUnorderedPairs(int[] arrayA, int[] arrayB){
	for(int i = 0; i < arrayA.length; i++){
		for(int j = 0; j < arrayB.length; j++){
			for(int k = 0; k < 100000; k++){
				System.out.println(arrayA[i] + "," + arrayB[j]);
			}
		}
	}
}

/*
	Nothing has really changed here. 100,000 units of work is still constant, so the runtime is
	O(ab).
*/