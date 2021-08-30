/* 
	What is the runtime?
*/

void printPairs(int[] array){
	for(int i = 0; i < array.length; i++){
		for(int j = 0; j < array.length; j++){
			System.out.println(array[i] + "," + array[j]);
		}
	}
}

/*
	The runtime is O(N^2).
*/