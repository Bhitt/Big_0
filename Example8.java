/* 
	Suppose we had an algorithm that took in an array of strings, sorted each string, and then sorted
	the full array. What would the runtime be?
*/

/*
	The common mistake is to use the same term, N for instance, to describe the lengths of strings
	and the length of the array. They may not have a relationship.

	-Let s be the length of the longest string.
	-Let a be the length of the array.

	Now we can work through this in parts:
		- Sort each string in O(s log s).
		- We do this for each string, so that's O(a*s log s)
		- Now we sort all the strings. There are a strings, so you may be inclined to say that this
		takes O(a log a) time. This is what most would say. You should also take into account that
		you need to compare the strings. Each comparison takes O(s) time. There are O(a log a)
		comparisons, therefore this will take O(a*s log a) time.

	If you add up these, you get O(a*s(log a + log s)).
*/