/*
	The following code reverses an array. What is the runtime?
*/

void reverse(int[] array){
	for(int i = 0; i < array.length / 2; i++){
		int other = array.length - i - 1;
		int temp = array[i];
		array[i] = array[other];
		array[other] = temp;
	}
}

/*
	This runs in O(N) time. Going through only half the array does not affect the runtime.
*/