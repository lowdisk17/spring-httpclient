package com.http.http.controller;

import org.springframework.web.bind.annotation.RestController;

import com.http.http.service.MainService;

import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MainController {

  @Autowired
  MainService service;

  @GetMapping("service")
  public String getMethodName() {
      try {
        return service.execute();
      } catch (URISyntaxException | IOException | InterruptedException e) {
        System.out.println("Error: " + e.getMessage());
      }
      return "The request encounters an error";
  }
  
}
