package com.example.demo.Server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageRepository messageRepository;

    @PostMapping("/send")
    public void sendMessage(@RequestBody Message message) {
        messageRepository.save(message);
    }

    @GetMapping("/get")
    public List<Message> getMessages(@RequestParam String sender, @RequestParam String receiver) {
        return messageRepository.findBySenderAndReceiver(sender, receiver);
    }
}
