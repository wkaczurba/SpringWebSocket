package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocket implements WebSocketConfigurer {

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		registry.addHandler(marcoHandler(), "/marco").withSockJS();
	}	
	
	// Remember to add Jackson (e.g.: com.fasterxml.jackson.core:jackson-databind:2.3.1), otherwise you will get:
	// java.lang.IllegalStateException: A SockJsMessageCodec is required but not available: Add Jackson to the classpath, or configure a custom SockJsMessageCodec.
	@Bean
	public MarcoHandler marcoHandler() {
		return new MarcoHandler();
	}
	

	
}
