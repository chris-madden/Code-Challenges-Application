package com.challenges;

/*
    ProblemChallenge is a specific type of challenge which can be selected
*/
public class ProblemChallenge extends ChallengeFactory
{
    protected Challenge createChallenge(String challengeType)
    {
        if (challengeType.equals("SearchInsertPosition"))
        {
            return new SearchInsertPosition();
        }
        return null;
    }
}
