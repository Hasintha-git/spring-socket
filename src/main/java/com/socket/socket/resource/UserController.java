package com.socket.socket.resource;

import com.socket.socket.model.User;
import com.socket.socket.model.UserResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @MessageMapping("/user")
    @SendTo("/topic/user")
    public UserResponse getUser(User user){
        return new UserResponse("Hi " + user.getUser());
    }
}
