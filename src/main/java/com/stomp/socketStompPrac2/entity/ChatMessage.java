package com.stomp.socketStompPrac2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ChatMessage {

    public enum MessageType {
        ENTER, TALK
    }

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MessageType type; // 메세지 타입

    @Column(nullable = false)
    private String roomId; // 채팅방 ID

    @Column(nullable = false)
    private String sender; // 보내는 사람

    @Column(nullable = false)
    private String message; // 채팅 내용
}
