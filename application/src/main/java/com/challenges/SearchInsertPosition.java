package com.challenges;

import java.util.Arrays;

/*
    SearchInsertPosition is a concrete implementation of Challenge.
    Object gets returned as type challenge
*/
public class SearchInsertPosition extends Challenge
{
    // Hard coding initialization for now
    private final int[] numbers = {2,4,5,6,8};
    private final int target = 5;
    private int result;

    public SearchInsertPosition() {
        name = "Search Insert Position";
        description = "Given a sorted array of distinct integers and a target value, return the index if the target is found";
    }

    public void solveChallenge()
    {
        int index = Arrays.binarySearch(numbers, target);

        if (index >= 0)
            result = index;
        else
            result = findInsertionPoint(Math.abs(index));
    }

    private int findInsertionPoint(int index)
    {
        return (index - 1);
    }

    public String getResult()
    {
        return "Result From Search Insert Position: " + result;
    }
}
