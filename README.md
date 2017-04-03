# Capital One Coding Exercise

Thank you for taking the time to complete our coding exercise.  
We have chosen this exercise because it gives you an opportunity to show off your coding skills, and allows us to peer into your brilliant mind -- how you think, how you structure your code, and how you break down complex problems.  
The exercise is meant to be challenging.  
Please don't let that turn you off.  

If you accomplish this challenge, we'd like to talk to you ASAP!  

# Code Challenge - Powers of Five

John loves powers of 5 (e.g., 1, 5, 25, 125, 625, …).  
He has a binary string, s, composed of 0's and 1's representing the bits of a binary number.  
John wants to know the minimum number of pieces, k, that he must split the string into such that each of the k pieces are binary representations of powers of 5 (with no leading zeroes).  
Note that this may not always be possible for every binary string s.  

Complete the getMin function in your editor. It has 1 parameter: a string, s, consisting of 0's and/or 1's.  
It must return an integer denoting the value of k; if there is no such positive integer k, return −1.  

##Input Format
The locked stub code in your editor reads a binary string, s, from stdin and passes it to your function.

##Constraints
The characters in S are ∈ {'0', '1'}.
1 ≤ |S| ≤ 50

##Output Format
Your function must return either some positive integer k (denoting the minimum number of pieces s must be cut into such that each piece corresponds with the binary representation of some power of 5), or −1 if no such k exists.

###Sample Input 0
101101101

###Sample Output 0
3

###Sample Input 1
1111101

###Sample Output 1
1

###Sample Input 2
00000

###Sample Output 2
-1

###Sample Input 3
00001
###Sample Output 3
-1

##Explanation
###Sample Case 0:
"101101101" is not the binary representation of any power of 5, so we must see if it can be split into components that correspond with powers of 5. We can split the string into three 101's ((0b101) → (5^1)), so we return 3.

###Sample Case 1:
"1111101" is already a power of 5 ((0b1111101) → (5^3)), so we return 1.

###Sample Case 2:
00000 is not a power of 5, and also cannot be split into powers of 5. Because no valid k exists, we return −1.

###Sample Case 2:
000100 contains leading zeros, and is also not a power of 5. Because no valid k exists, we return −1.

# Requirements
* All unit tests must pass.  
* Unit tests are located at ./src/test/java/SolutionTest.java
* You may add unit tests, but you may not edit the ones that are currently there.  
* The solution must be multi-threaded and showcase appropriate synchronization techniques.

# Grading Criteria
1. Unit tests must pass.
2. Multithreading and synchronization techniques
3. Performance - runtime to pass unit tests
3. Proper design patterns
4. Documentation of your code / thought process

# Environment
Use your favorite IDE.
This code has been tested in IntelliJ and Eclipse.
There is a pom.xml file included for easy import of jUnit from Maven.

# Time Expectations
This test is expected approximately 1 hour.

Good luck!
