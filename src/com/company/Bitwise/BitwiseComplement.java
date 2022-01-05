package com.company.Bitwise;
// LeetCode Link
//https://leetcode.com/problems/complement-of-base-10-integer/
class BitwiseComplement {
    public int bitwiseComplement(int n) {

        if(n ==0)
            return 1;

        int ans = 0;// initilize the number to 0. All bits are 0
        int setBit = 1;//to set the ith bit.
        while(n !=0)
        {
            int lastBit = n & 1;//Getting the last bit of a number n
            if(lastBit ==0)
            {
                ans = ans | setBit;//if last bit is 0 set 1 to ans bit.

            }
            //else for set bit in n ans bit is already set to 0 so no operation required.
            setBit = setBit <<1;//move set bit to next ith bit
            n = n >>>1;//right shift n to get next bit as last bit. till it becomes 0
        }
        return ans;
    }
}


//Alternate solution
/*
        xor of a number with its complement gives 11111.....1111 number
                1010
                0101
                -----
                1111
         A ^ B = C
         A^ A^ B = A^ c
         0 ^B = A^C (A^A =0)
         B = A^C (0^B = B)

         ans  = 111111^ n;

         To generate number 11111..11  lef shift operator -1
         get the length of n in binary.
         do left shift (1<< length)-1 ==>11111
         do xor with the result.

         (1<<(Ineger.toBinaryString(n).length())-1)^n)
 */