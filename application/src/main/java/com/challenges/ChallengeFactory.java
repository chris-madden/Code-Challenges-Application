package com.challenges;

public abstract class ChallengeFactory
{
    public Challenge selectChallenge(String challengeType)
    {
        Challenge challenge;

        challenge = createChallenge(challengeType);

        return challenge;
    }

    protected abstract Challenge createChallenge(String challengeType);
}
