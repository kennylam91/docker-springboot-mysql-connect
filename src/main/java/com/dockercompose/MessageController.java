package com.dockercompose;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@Autowired
	private MessageRepository messageRepo;

	@GetMapping("/messages")
	public ResponseEntity<List<Message>> getAll() {
		return ResponseEntity.ok(messageRepo.findAll());
	}
	

}
