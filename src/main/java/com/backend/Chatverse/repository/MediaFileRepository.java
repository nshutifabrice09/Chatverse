package com.backend.Chatverse.repository;

import com.backend.Chatverse.model.MediaFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaFileRepository extends JpaRepository <MediaFile, Long> {
}
