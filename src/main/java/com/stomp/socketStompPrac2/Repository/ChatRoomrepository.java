package com.stomp.socketStompPrac2.Repository;

import com.stomp.socketStompPrac2.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomrepository extends JpaRepository<ChatRoom,Long> {

}
