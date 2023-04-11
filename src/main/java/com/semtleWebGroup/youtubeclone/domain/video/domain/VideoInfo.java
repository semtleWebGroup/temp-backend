package com.semtleWebGroup.youtubeclone.domain.video.domain;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDateTime;

@Entity
@Table(name="video_info")
@Getter
@NoArgsConstructor
public class VideoInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "videoid", updatable = false)
    private Long id;

    @Column(nullable = false, length=45)
    private String title;

    @Column(length=45)
    private String description;

    @Lob
    private Blob thumbImg;

    @CreatedDate
    private LocalDateTime createdTime;

    @LastModifiedDate
    private LocalDateTime updatedTime;

    private int videoSec;
    private int viewCount;

    @Builder
    public VideoInfo(Long id, String title, String description, Blob thumbImg, int videoSec) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.thumbImg = thumbImg;
        this.createdTime = LocalDateTime.now();
        this.updatedTime = LocalDateTime.now();
        this.videoSec = videoSec;
        this.viewCount = 0;

    }
}
