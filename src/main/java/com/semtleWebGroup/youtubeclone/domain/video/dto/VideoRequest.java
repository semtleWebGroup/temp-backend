package com.semtleWebGroup.youtubeclone.domain.video.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class VideoRequest {
    @NotEmpty(message="'title' cannot be empty.")
    @Size(max=45, message="'title' length should be <= 45.")
    private String title;

    @Size(max=45, message="'description' length should be <= 45.")
    private String description;

}
