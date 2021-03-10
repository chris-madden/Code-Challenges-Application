package com.challenges;

public abstract class Challenge
{
    // Define What A Challenge Requires
    protected String name;
    protected String description;

    protected abstract int solveChallenge();

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }
}
