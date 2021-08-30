/*
	The following code sums up the values of all the nodes in a balanced binary search tree.
	What is the runtime?
*/

int sum(Node node){
	if(node == null){
		return 0;
	}
	return sum(node.left) + node.value + sum(node.right);
}

/*
	Just because it's a binary search tree doesn't mean that there is a log in it.

	We touch each element in the tree and do constant work so the runtime is O(N), where N is the
	number of nodes.

	If you used the previously described idea of O(branches ^ depth), then you would get
		O(2 ^ depth)
	Since this is a balanced binary search tree, the depth is roughly log N. So,
		O(2 ^ log N)
	Which is equivalent to
	 	O(N).
*/