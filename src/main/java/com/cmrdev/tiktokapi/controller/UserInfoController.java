package com.cmrdev.tiktokapi.controller;


import com.cmrdev.tiktokapi.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserInfoController {

  private final UserInfoService userInfoService;

  @GetMapping(value = "/get-tiktok-user-info/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  private ResponseEntity<String> getUserInfo(@PathVariable String id){
    return userInfoService.getUserInfo(id);
  }
}
