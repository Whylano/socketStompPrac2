package com.stomp.socketStompPrac2.Repository;

import com.stomp.socketStompPrac2.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatMessageRepository extends JpaRepository<ChatMessage,Long> {
}
