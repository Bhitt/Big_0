/*
	The following prints all Fibonacci numbers from 0 to n. However, this time, it stores (i.e., 
	caches) previously computed values in an integer array. If it has already been computed, it just
	returns the cache.
	What is the runtime?
*/

void allFib(int n){
	int[] memo = new int[n+1];
	for(int i=0; i<n; i++){
		System.out.println(i + ": " + fib(i, memo));
	}
}

int fib(int n, int[] memo){
	if(n <= 0) return 0;
	else if(n == 1) return 1;
	else if(memo[n] > 0) return memo[n];

	memo[n] = fib(n-1, memo) + fib(n-2, memo);
	return memo[n];
}

/*
	Since we are using cacheing, we only ever compute a fibonacci number in the sequence once.
	So, to compute all fibs up to n, we compute n numbers and do O(n) work.

	This is memoization
*/