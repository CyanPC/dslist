package com.cyanpc.dslist.dto;

import com.cyanpc.dslist.entity.Game;

public class GameDTO {

    private Long id;
    private String title;
    private Integer releaseYear;
    private String imgUrl;
    private String shortDescription;

    public GameDTO() {}

    public GameDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        releaseYear = entity.getReleaseYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
