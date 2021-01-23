package com.kodilla.patterns.strategy.social;

public class User {
    private String name;
    protected SocialPublisher favSocialService;

    public User(String name) {
        this.name = name;
    }

    public void setFavSocialService(SocialPublisher socialPublisher){
        this.favSocialService = socialPublisher;
    }

    public String sharePost(){
        return favSocialService.share();
    }

}
