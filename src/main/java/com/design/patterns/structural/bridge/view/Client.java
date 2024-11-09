package com.design.patterns.structural.bridge.view;

import com.design.patterns.structural.bridge.view.model.AudioAlbum;
import com.design.patterns.structural.bridge.view.model.Book;
import com.design.patterns.structural.bridge.view.resource.AudioAlbumMediaResourceAdapter;
import com.design.patterns.structural.bridge.view.resource.BookMediaResourceAdapter;
import com.design.patterns.structural.bridge.view.view.LongView;
import com.design.patterns.structural.bridge.view.view.ShortView;
import com.design.patterns.structural.bridge.view.view.View;

public class Client {

    public static void main(String[] args) {
        AudioAlbum audioAlbum = new AudioAlbum();
        Book book = new Book();
        View shortViewAudioAlbum = new ShortView(new AudioAlbumMediaResourceAdapter(audioAlbum));
        View shortViewBook = new ShortView(new BookMediaResourceAdapter(book));
        View longViewAudioAlbum = new LongView(new AudioAlbumMediaResourceAdapter(audioAlbum));
        View longViewBook = new LongView(new BookMediaResourceAdapter(book));

        shortViewAudioAlbum.render();
        shortViewBook.render();
        longViewAudioAlbum.render();
        longViewBook.render();
    }

}
