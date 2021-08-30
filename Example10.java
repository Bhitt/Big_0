/*
	The following method checks if a number is prime by checking for divisibilty on numbers less
	than it. It only needs to go up to the square root.

	Example:
		While 33 is divisible by 11, the "counterpart" to 11 is 3. 33 will have already been 
		elminated as a prime by 3.
*/

boolean isPrime(int n){
	for(int x = 2; x * x <= n; x++ ){
		if(n % x == 0){
			return false;
		}
	}
	return true;
}

/*
	The work inside the loop is constant. Therefore, we just need to know how many iterations the
	for loop goes through in the worst case. It stops when x = √n.

	This runs in O(√n) time.
*/