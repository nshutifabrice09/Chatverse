package com.backend.Chatverse.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "media_files")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MediaFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;
    private String fileType;
    private String url;

    @OneToOne
    @JoinColumn(name = "message_id")
    private Message message;

    private LocalDate uploadedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public LocalDate getUploadedAt() {
        return uploadedAt;
    }

    public void setUploadedAt(LocalDate uploadedAt) {
        this.uploadedAt = uploadedAt;
    }
}