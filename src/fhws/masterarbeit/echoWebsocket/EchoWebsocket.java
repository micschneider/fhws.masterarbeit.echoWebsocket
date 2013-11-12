package fhws.masterarbeit.echoWebsocket;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/echoWebsocket")
public class EchoWebsocket 
{
	@OnMessage
	public String incomingMessage(String message)
	{
		return ("Hier spricht der ServerEndpoint! Ich habe diese Nachricht erhalten: " + message);
	}
}
