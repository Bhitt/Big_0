/*
	The following code computes the Nth Fibonacci number
*/

int fib(int n){
	if(n <= 0) return 0;
	else if(n == 1) return 1;
	return fib(n-1) + fib(n-2);
}

/*
	We can use the earlier pattern for recursive calls: O(branches ^ depth).

	There are 2 branches per call, and we go as deep as N, so the runtime is O(2^N).
*/