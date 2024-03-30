package com.http.http.service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.springframework.stereotype.Service;

@Service
public class MainService {

  public String execute () throws URISyntaxException, IOException, InterruptedException {
    HttpRequest request = HttpRequest.newBuilder()
      .uri(new URI("https://google.com"))
      .timeout(Duration.of(10, ChronoUnit.SECONDS))
      .GET()
      .build();
    HttpResponse<String> response = HttpClient.newHttpClient().send(request, BodyHandlers.ofString());
    return response.body();
  }

  /*
   HttpRequest request = HttpRequest.newBuilder()
    .uri(new URI("https://your-url.com"))
    .POST(HttpRequest.BodyPublishers.noBody())
    .build();
   */

  /*
   HttpRequest request = HttpRequest.newBuilder()
    .uri(new URI("https://your-url.com"))
    .version(HttpClient.Version.HTTP_2)
    .GET()
    .build();
   */

  /*
   HttpRequest request2 = HttpRequest.newBuilder()
    .uri(new URI("https://your-url.com"))
    .header("key1", "value1")
    .header("key2", "value2")
    .GET()
    .build();
   */

  /*
   HttpRequest request = HttpRequest.newBuilder()
    .uri(new URI("https://your-url.com"))
    .POST(HttpRequest.BodyPublishers.noBody())
    .build();
   */

  /*
   HttpRequest request = HttpRequest.newBuilder()
    .uri(new URI("https://your-url.com"))
    .headers("Content-Type", "text/plain;charset=UTF-8")
    .POST(HttpRequest.BodyPublishers.ofString("Sample request body"))
    .build();
   */

  /*
   byte[] sampleData = "Sample request body".getBytes();
   HttpRequest request = HttpRequest.newBuilder()
    .uri(new URI("https://your-url.com"))
    .headers("Content-Type", "text/plain;charset=UTF-8")
    .POST(HttpRequest.BodyPublishers
    .ofInputStream(() -> new ByteArrayInputStream(sampleData)))
    .build(); 
   */

  /*
   byte[] sampleData = "Sample request body".getBytes();
   HttpRequest request = HttpRequest.newBuilder()
    .uri(new URI("https://your-url.com"))
    .headers("Content-Type", "text/plain;charset=UTF-8")
    .POST(HttpRequest.BodyPublishers.ofByteArray(sampleData))
    .build();
   */

   /*
    HttpRequest request = HttpRequest.newBuilder()
      .uri(new URI("https://your-url.com"))
      .headers("Content-Type", "text/plain;charset=UTF-8")
      .POST(HttpRequest.BodyPublishers.fromFile(
        Paths.get("src/test/resources/sample.txt")))
      .build();
    */

    /*
     HttpResponse<String> response = HttpClient
      .newBuilder()
      .proxy(ProxySelector.getDefault())
      .build()
      .send(request, BodyHandlers.ofString());
     */

    /*
     HttpResponse<String> response = HttpClient.newBuilder()
      .followRedirects(HttpClient.Redirect.ALWAYS)
      .build()
      .send(request, BodyHandlers.ofString());
     */

     /*
      HttpResponse<String> response = HttpClient.newBuilder()
        .authenticator(new Authenticator() {
          @Override
          protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(
              "username", 
              "password".toCharArray());
          }
      }).build()
        .send(request, BodyHandlers.ofString());
      */

     /*
      HttpResponse<String> response = HttpClient.newBuilder()
      .build()
      .send(request, BodyHandlers.ofString());
      */

      /*
       CompletableFuture<HttpResponse<String>> response = HttpClient.newBuilder()
        .build()
        .sendAsync(request, HttpResponse.BodyHandlers.ofString());
       */
  
}
