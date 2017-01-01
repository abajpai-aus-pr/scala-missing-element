# scala-missing-element
find the missing element in the given collection

A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing. Goal is to find that missing element. Write a function:

class Solution { public int solution(int[] A); }
that, given a zero-indexed array A, returns the value of the missing element. For example, given array A such that:
A[0] = 2
A[1] = 3
A[2] = 1
A[3] = 5
the function should return 4, as it is the missing element.

logic to sove this is : first find out sum of N natural numbers [ N*(N+1) / 2 ] and then sum of available elements in the given array. Difference between two is the missing element.
