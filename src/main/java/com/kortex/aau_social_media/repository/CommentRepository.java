package com.kortex.aau_social_media.repository;

import com.kortex.aau_social_media.model.Comment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByAnnouncementIdOrderByCreatedAtDesc(Long announcementId);
}
