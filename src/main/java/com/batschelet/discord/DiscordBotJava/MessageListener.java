package com.batschelet.discord.DiscordBotJava;

import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.MessageReceivedEvent;
import sx.blah.discord.util.DiscordException;
import sx.blah.discord.util.MessageBuilder;
import sx.blah.discord.util.MissingPermissionsException;
import sx.blah.discord.util.RateLimitException;

public class MessageListener 
{
	Boolean talkcool = true;
	//alright you gotta remember to terminate the script in between tests or else it breaks
	@EventSubscriber
	public void messageRepeater(MessageReceivedEvent event)
	{
		
		System.out.println("message recieved");
        try 
        {
        	System.out.println("testing 1 2 3");
        	String message = event.getMessage().getContent();
        	
        	if(message.equalsIgnoreCase("rbots leave 4ever"))
       	 	{
       			new MessageBuilder(App.client).withChannel(event.getMessage().getChannel()).withContent("goodbye forever").build();
       			App.client.logout();
       	 	}
        	else if(message.equalsIgnoreCase("rbots leave now please"))
        	{
        		//App.client.logout();
        		new MessageBuilder(App.client).withChannel(event.getMessage().getChannel()).withContent("ok im asleep").build();
        		talkcool = false;
        	}
        	else if(message.equalsIgnoreCase("tyro") && talkcool)
        	{
        		new MessageBuilder(App.client).withChannel(event.getMessage().getChannel()).withContent("tyro may or may not be cool depending on how rbats feels about him at that particular moment").build();
        	}
        	else if(talkcool)
        	{
        		new MessageBuilder(App.client).withChannel(event.getMessage().getChannel()).withContent(event.getMessage().getContent()).build();
        		System.out.println("y u do dis");
        	}
        	else if(message.equalsIgnoreCase("rbots come back now"))
        	{
        		new MessageBuilder(App.client).withChannel(event.getMessage().getChannel()).withContent("ok im awake").build();
        		talkcool = true;
        	}

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


	}
}
