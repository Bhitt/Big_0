/*
	The following function prints the powers of 2 from 1 through n (inclusive). For example, if n
	is 4, it would print 1, 2, 4. What is the runtime?
*/

int powersOf2(int n){
	if(n < 1){
		return 0;
	} else if(n == 1){
		System.out.println(1);
		return 1;
	} else {
		int prev = powersOf2(n/2);
		int curr = prev * 2;
		System.out.println(curr);
		return curr;
	}
}

/*
	Each recursive call cuts the number in half.
	This gives us a O(log n) time.
*/