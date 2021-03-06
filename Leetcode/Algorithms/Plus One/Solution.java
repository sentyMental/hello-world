//Problem: https://leetcode.com/problems/plus-one/description/

public class Solution {
    public int[] plusOne(int[] digits) {
        int lastDig = digits[digits.length-1];
        int size = digits.length;
        boolean incSize = true; 
        if(lastDig == 9){
            //check to see if we need to add a digit to the number
            for(int digit : digits){
                if(digit!=9) incSize = false;
            }
            //if we need to add a digit
            if(incSize){
                digits = new int[size+1];
                for(int i = 0; i < digits.length; i++){
                    if(i == 0){ digits[i] = 1;}
                    else{digits[i] = 0;}
                }
            }else{
                for(int i = digits.length-1; i >= 0; i--){
                    if(digits[i] != 9){
                        digits[i] = digits[i]+1;
                        break;
                    }
                    digits[i] = 0;
                }
            }
        }else{
            digits[digits.length-1] = lastDig + 1;
        }
        return digits;
    }
}

//shorter solution:

public int[] plusOne(int[] digits) {
        
    int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        
        digits[i] = 0;
    }
    
    int[] newNumber = new int [n+1];
    newNumber[0] = 1;
    
    return newNumber;
}
