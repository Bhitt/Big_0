/*
	This code counts all permutations of a string
*/

void permutation(String str){
	permutation(str, "");
}

void permutation(String str, String prefix){
	if(str.length() == 0){
		System.out.println(prefix);
	} else {
		for(int i = 0; i < str.length(); i++){
			String rem = str.substring(0, i) + str.substring(i + 1);
			permutation(rem, prefix + str.charAt(i));
		}
	}
}

/*
	Permutation is called n! times in its base case (when prefix is the full permutation).
	Each leaf (which calls permutation in its base case) is attached to a path of length n.
		There will be no more than n * n! (function calls) in this tree.
	The sum of the lengths of rem, prefix, and str.charAt(i) will always be n. So each node in our
		tree represents n work.

	So the total runtime will not exceed O(n^2 * n!).
*/