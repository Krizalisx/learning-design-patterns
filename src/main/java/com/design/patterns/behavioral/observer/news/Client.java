package com.design.patterns.behavioral.observer.news;

import com.design.patterns.behavioral.observer.news.observable.NewsPublisher;
import com.design.patterns.behavioral.observer.news.observer.NewsSubscriber;

public class Client {

    public static void main(String[] args) {
        NewsPublisher newsPublisher = new NewsPublisher();
        NewsSubscriber newsSubscriber = new NewsSubscriber();
        newsPublisher.addObserver(newsSubscriber);

        newsPublisher.produceNews("A strategy pattern is great!");
        newsPublisher.produceNews("An observer pattern is even greater!");

        newsPublisher.removeObserver(newsSubscriber);

        newsPublisher.produceNews("Design patterns are great!");
    }

}
