package com.challenges;

public abstract class ChallengeFactory
{
    // Provides Access To Types Of Challenges
    public Challenge selectChallenge(String challengeType)
    {
        Challenge challenge;

        challenge = createChallenge(challengeType);

        // What do you want to do with the challenge
        challenge.solveChallenge();

        return challenge;
    }

    protected abstract Challenge createChallenge(String challengeType);
}
