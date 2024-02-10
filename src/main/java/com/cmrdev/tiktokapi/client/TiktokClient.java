package com.cmrdev.tiktokapi.client;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "tiktok-client", url = "https://www.tiktok.com")
public interface TiktokClient {


    @GetMapping(value = "/{id}", produces = MediaType.TEXT_HTML_VALUE)
    String getHtmlContent(@PathVariable String id);
}
