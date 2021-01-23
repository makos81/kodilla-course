package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        User millenial = new Millenials("mileniek");
        User ygeneration = new YGeneration("ytek");
        User zgeneration = new ZGeneration("ztek");

        String millenialSocialService = millenial.sharePost();
        String ygenerationSocialService = ygeneration.sharePost();
        String zgenerationSocialService = zgeneration.sharePost();

        Assertions.assertEquals("Snapchat", millenialSocialService);
        Assertions.assertEquals("Twitter", ygenerationSocialService);
        Assertions.assertEquals("Facebook", zgenerationSocialService);
    }

    @Test
    public void testIndividualSharingStrategy(){
        User millenialUser = new Millenials("mileniek");

        String initialSocialService = millenialUser.sharePost();
        millenialUser.setFavSocialService(new TwitterPublisher());
        String newSocialService = millenialUser.sharePost();

        Assertions.assertEquals("Snapchat", initialSocialService);
        Assertions.assertEquals("Twitter", newSocialService);

    }
}
