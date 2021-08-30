/* 
	the following code computes n ! (n factorial). What is the time complexity?
*/

int factorial(int n){
	if(n < 0){
		return -1;
	} else if(n == 0){
		return 1;
	} else {
		return n * factorial(n-1);
	}
}

/*
	This just recursion from n-1 down to 1. It will take O(n) time.
*/