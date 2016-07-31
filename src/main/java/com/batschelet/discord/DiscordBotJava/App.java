package com.batschelet.discord.DiscordBotJava;

import sx.blah.discord.api.*;
import sx.blah.discord.util.DiscordException;
import sx.blah.discord.util.MessageBuilder;
import sx.blah.discord.util.RateLimitException;

/**
 * Hello world!
 *
 */
public class App 
{
	static IDiscordClient client;
	
    public static void main( String[] args ) throws DiscordException
    {
    	String token = "MjA4NjcyMjczNzA2NTE2NDgw.Cn2Y4A.Mo6CJilW9Ksn5ysD11eO0YAhmsk";
        client = new ClientBuilder().withToken(token).login();
        client.getDispatcher().registerListener(new AnnotationListener());
        client.getDispatcher().registerListener(new MessageListener());
        //new MessageBuilder(App.client).withChannel(event.getMessage().getChannel()).withContent(event.getMessage().getContent()).build();

    }
}
