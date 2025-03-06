# Maximum-Distnace
Problem statement
You have been given an array 'A' of N integers. You need to find the maximum value of j - i subjected to the constraint of A[i] <= A[j], where ‘i’ and ‘j’ are the indices of the array.

For example :
If 'A' = {3, 5, 4, 1}

then the output will be 2.
Maximum value occurs for the pair (3, 4)
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 100
1 <= N <= 10 ^ 4
-10 ^ 5 <= A[i] <= 10 ^ 5

Time limit: 1 sec.
Sample Input 1:
1
9
34 8 10 3 2 80 30 33 1
Sample Output 1:
6
Explanation:
Maximum value occurs for the pair (8, 33)
Sample Input 2:
1
10
9 2 3 4 5 6 7 8 18 0
Sample Output 2:
8
Explanation:
Maximum value occurs for the pair (9, 18)
