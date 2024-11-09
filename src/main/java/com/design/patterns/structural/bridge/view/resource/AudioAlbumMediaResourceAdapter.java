package com.design.patterns.structural.bridge.view.resource;

import com.design.patterns.structural.bridge.view.model.AudioAlbum;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class AudioAlbumMediaResourceAdapter implements MediaResource {

    private final AudioAlbum audioAlbum;

    @Override
    public String getSnippet() {
        return audioAlbum.getAbout();
    }

    @Override
    public String getUrl() {
        return audioAlbum.getName() + " " + audioAlbum.getGenre();
    }

    @Override
    public String getImage() {
        return audioAlbum.getCover();
    }

    @Override
    public String getTitle() {
        return audioAlbum.getName();
    }
}
