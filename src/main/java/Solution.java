import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    public Solution(){
    }

    /**
     * Takes in an array of strings, and returns an array of answers
     * @param s - string input array
     * @return - array of int answers of how many powers of five fit into each string in the array
     */
  public int[] getMin(String[] inputs) {
	   int[] result = new int[inputs.length];
	  int i=0;
	  for(String input:inputs){
        //check if it has something other than 1s and 0s
        if (!input.matches("[01]+")) {
            throw new IllegalArgumentException("Not a binary input");
        }

        List<String> powersList = getPowersArray(input);

//        System.out.println("powersList is " + powersList);

        int min = calcMin(input, powersList, powersList.size()-1);
        if (min == 0) {
            result[i]= -1;
        } else {
        	result[i]= min;
        }
        i++;
	  }
	  return result;
    }

    private int calcMin(String input, List<String> powersList, int powersListIndex) {

        if (powersListIndex == -1) {
            return 0;
        } else {
//            System.out.println("in calcMin input is " + input + " powersListIndex " + powersListIndex + " comparing " + powersList.get(powersListIndex));

            int matchingIndex = input.indexOf(powersList.get(powersListIndex));
//            System.out.println("matchingIndex " + matchingIndex);
            if (matchingIndex > -1){

                String leftString = input.substring(0, matchingIndex);
                String rightString = input.substring(matchingIndex + powersList.get(powersListIndex).length(), input.length());
                int left = calcMin(leftString, powersList, powersListIndex);
                int right = calcMin(rightString, powersList, powersListIndex);
                if (leftString.startsWith("0") || rightString.startsWith("0")) {
                    return -1;
                } else {
                    return left + right + 1;
                }
            } else {
                return calcMin(input, powersList, powersListIndex -1);
            }
        }
    }

    private List<String> getPowersArray(String input) {
        int lengthOfLatestEntry = 0;
        List<String> powersList = new ArrayList<String>();
        int index = 0;

        while(lengthOfLatestEntry < input.length()) {
            double power5 = Math.pow(5, index);
            index ++;
            String binaryRep = Long.toBinaryString((long)power5);
            lengthOfLatestEntry = binaryRep.length();
//            System.out.println("adding " + binaryRep);
            powersList.add(binaryRep);
        }
        return powersList;
    }


}