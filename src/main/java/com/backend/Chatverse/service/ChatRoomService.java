package com.backend.Chatverse.service;

import com.backend.Chatverse.model.ChatRoom;

import java.util.List;

public interface ChatRoomService {
    List<ChatRoom> chatRoomList();
    ChatRoom getChatRoomById(Long id);
    ChatRoom saveChatRoom(ChatRoom chatRoom, Long userId);
    ChatRoom updateChatRoom(Long id, ChatRoom chatRoom);
    void removeChatRoom (Long id);
}
