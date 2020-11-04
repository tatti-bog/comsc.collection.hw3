package com.company;
import static ibio.Helpers.*;
import ibadts.IBCollection;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IBCollection<Integer> nums = new IBCollection<>();

        int amount = inputInt("how many integers do you need in the array?  ");

        while (amount>0) {
            nums.add(new Integer[]{inputInt("type a non negative integer  ")});
            amount = amount - 1;

        }

        // check if empty but doesn't work!!!
        if (nums.isEmpty())
            output("you didn't type anything");

        else if (nums.hasNext())
        {

        // check for negative
        int sum = 0;
        int count = 0;

        while (nums.hasNext())
        {
            int n = nums.getNext();
            if (n<0)
                output("you put a wrong number");

            sum = sum + n;
            count = count + 1;

        }

        int mean = sum/count;

            nums.resetNext();

        while (nums.hasNext())

        {
            int n = nums.getNext();
            if ( (n/mean)> 1.50)
                output(n);


        }


        }
    }

}

