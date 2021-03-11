package com.challenges;

public abstract class Challenge
{
    // Define What A Challenge Requires
    protected String name;
    protected String description;

    public abstract void solveChallenge();

    public abstract String getResult();

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }
}
