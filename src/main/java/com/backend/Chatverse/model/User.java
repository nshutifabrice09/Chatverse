package com.backend.Chatverse.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    private String displayName;
    private String password;
    private String avatarUrl;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    private Boolean isOnline = false;

    @ManyToMany(mappedBy = "participants")
    private List<ChatRoom> chatRooms = new ArrayList<>();

    @OneToMany(mappedBy = "sender", cascade = CascadeType.ALL)
    private List<Message> sentMessages = new ArrayList<>();
}
