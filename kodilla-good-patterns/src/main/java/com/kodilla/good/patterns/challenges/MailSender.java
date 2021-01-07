package com.kodilla.good.patterns.challenges;

public class MailSender implements OrderInformer{
    @Override
    public void sendMessage(User user){
        System.out.print("sending message to " + user.getFirstName() + " " + user.getLastName() + "\n");
    }
}
