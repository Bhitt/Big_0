/*
	The following code prints all Fibonacci numbers from 0 to n
	What is the complexity?
*/

void allFib(int n){
	for(int i = 0; i < n; i++){
		System.out.println(i + ": " + fib(i));
	}
}

int fib(int n){
	if(n <= 0) return 0;
	else if(n == 1) return 1;
	return fib(n-1) + fib(n-2);
}

/*
	The value of n matters.

	fib(1) -> 2^1 steps
	fib(2) -> 2^2 steps
	...
	fib(n) -> 2^n steps

	The total amount of work is:
		2^1 + 2^2 + ... + 2^n
	This is equal to 2^(n+1), which is still O(2^n).
*/