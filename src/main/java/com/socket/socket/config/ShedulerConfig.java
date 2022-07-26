package com.socket.socket.config;

import com.socket.socket.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
public class ShedulerConfig {

    @Autowired
    SimpMessagingTemplate template;

    @Scheduled(fixedDelay = 3000)
    public void sendAdocMessages() {
        template.convertAndSend("/topic/user", new UserResponse("Fixed Delay Scheduler"));
    }
}
