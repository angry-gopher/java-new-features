package com.github.angrygopher.javanew.java11;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import static java.net.http.HttpClient.Version.HTTP_2;

public class HttpJavaClient {

    private static final String EXAMPLE_URI = "https://example.com";
    private static final int TIMEOUT = 5;

    public static void main(String[] args) throws IOException, InterruptedException {
        var httpClient = HttpClient.newBuilder()
                .version(HTTP_2)
                .connectTimeout(Duration.ofSeconds(TIMEOUT))
                .build();

        var request = HttpRequest.newBuilder()
                .GET()
                .uri(java.net.URI.create(EXAMPLE_URI))
                .build();

        var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        var headers = response.headers();
        headers.map().forEach((k, v) -> System.out.println(k + ":" + v));

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
