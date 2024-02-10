package com.cmrdev.tiktokapi.service;


import com.cmrdev.tiktokapi.client.TiktokClient;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserInfoService {

  private final TiktokClient tiktokClient;


  public ResponseEntity<String> getUserInfo(String id){


    Optional<String> response = tiktokClient.getHtmlContent(id).describeConstable();
    log.debug(response.orElse("null"));
    return new ResponseEntity<>(response.orElse(null), HttpStatus.OK);
  }
}
