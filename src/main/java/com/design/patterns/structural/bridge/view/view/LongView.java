package com.design.patterns.structural.bridge.view.view;

import com.design.patterns.structural.bridge.view.resource.MediaResource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class LongView implements View {

    private final MediaResource mediaResource;

    @Override
    public void render() {
        log.info("""
            Rendering long view:
            
            Title: {}
            Image: {}
            Snippet: {}
            Url: {}
            """, mediaResource.getTitle(), mediaResource.getImage(), mediaResource.getSnippet(), mediaResource.getUrl());
    }
}
