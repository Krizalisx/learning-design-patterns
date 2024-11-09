package com.design.patterns.structural.bridge.view.view;

import com.design.patterns.structural.bridge.view.resource.MediaResource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ShortView implements View {

    private final MediaResource resource;

    @Override
    public void render() {
        log.info("""
            Rendering short view:
            
            Title: {}
            Image: {}
            """, resource.getTitle(), resource.getImage());
    }
}
