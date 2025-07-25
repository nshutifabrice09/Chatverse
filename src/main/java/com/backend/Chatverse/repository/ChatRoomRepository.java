package com.backend.Chatverse.repository;

import com.backend.Chatverse.model.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRoomRepository extends JpaRepository <ChatRoom, Long> {
    ChatRoom findChatRoomById(Long id);
}
