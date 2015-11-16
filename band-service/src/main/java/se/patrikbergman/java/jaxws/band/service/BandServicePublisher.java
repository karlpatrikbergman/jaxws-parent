package se.patrikbergman.java.jaxws.band.service;

import com.google.common.collect.ImmutableList;
import se.patrikbergman.java.band.api.Band;

import javax.xml.ws.Endpoint;

public class BandServicePublisher {

    public static void publish() {
        final String url = "http://localhost:8888/bands";
        System.out.println("Publishing BandServiceImpl at endpoint " + url);
        Endpoint.publish(url, BandServiceImpl.of(
                ImmutableList.of(
                        Band.builder()
                                .name("Judas Priest")
                                .description("Judas Priest is a British heavy metal band formed in Birmingham, England, in 1970")
                                .rockFactor(7)
                                .build()
                )));
    }

    public static void main(String args[]) {
        publish();
    }
}
