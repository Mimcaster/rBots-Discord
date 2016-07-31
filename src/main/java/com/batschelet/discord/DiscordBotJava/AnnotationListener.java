package com.batschelet.discord.DiscordBotJava;

import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.MessageReceivedEvent;
import sx.blah.discord.handle.impl.events.ReadyEvent;
import sx.blah.discord.util.DiscordException;
import sx.blah.discord.util.MessageBuilder;
import sx.blah.discord.util.MissingPermissionsException;
import sx.blah.discord.util.RateLimitException;

public class AnnotationListener 
{
	public AnnotationListener(){}		//default constructor
	@EventSubscriber
	public void onReady(ReadyEvent event)
	{
		System.out.println("hello za warudo");
		
       // new MessageBuilder(App.client).withChannel(event.getMessage().getChannel()).withContent(event.getMessage().getContent()).build();

	try 
		{
			App.client.changeUsername("rBots.dumbParrot"); //it says im changing usernames too often jajajaja
	        //new MessageBuilder(App.client).withChannel(event.getMessage().getChannel()).withContent(event.getMessage().getContent()).build();

		} 
		catch (RateLimitException e) 
		{
			
			e.printStackTrace();
		} 
		catch (DiscordException e) 
		{
			
			e.printStackTrace();
		}
	}
	
	/*public void messageRepeater(MessageReceivedEvent event)
	{
        try 
        {
        	System.out.println("testing 1 2 3");
			new MessageBuilder(App.client).withChannel(event.getMessage().getChannel()).withContent(event.getMessage().getContent()).build();
		} 
        catch (RateLimitException e) 
        {
			e.printStackTrace();
		} 
        catch (DiscordException e) 
        {
			e.printStackTrace();
		} 
        catch (MissingPermissionsException e) 
        {
			e.printStackTrace();
		}

	}*/
}
