package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

public class MarcoHandler extends AbstractWebSocketHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(MarcoHandler.class); 
	
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		super.handleTextMessage(session, message);
		
		logger.info("Received message: " + message);
		
		Thread.sleep(2000);
		
		session.sendMessage(new TextMessage("Got it!."));
		
	}

}
