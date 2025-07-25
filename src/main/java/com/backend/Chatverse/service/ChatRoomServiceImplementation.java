package com.backend.Chatverse.service;

import com.backend.Chatverse.model.ChatRoom;
import com.backend.Chatverse.repository.ChatRoomRepository;
import com.backend.Chatverse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatRoomServiceImplementation implements ChatRoomService{

    private final ChatRoomRepository chatRoomRepository;
    private final UserRepository userRepository;

    @Autowired
    public ChatRoomServiceImplementation(ChatRoomRepository chatRoomRepository, UserRepository userRepository) {
        this.chatRoomRepository = chatRoomRepository;
        this.userRepository = userRepository;
    }


    @Override
    public List<ChatRoom> chatRoomList() {
        return null;
    }

    @Override
    public ChatRoom getChatRoomById(Long id) {
        return null;
    }

    @Override
    public ChatRoom saveChatRoom(ChatRoom chatRoom, Long userId) {
        return null;
    }

    @Override
    public ChatRoom updateChatRoom(Long id, ChatRoom chatRoom) {
        return null;
    }

    @Override
    public void removeChatRoom(Long id) {

    }
}
