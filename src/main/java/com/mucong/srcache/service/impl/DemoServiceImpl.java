package com.mucong.srcache.service.impl;

import com.mucong.srcache.service.DemoService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
@CacheConfig(cacheNames = "DemoService")
public class DemoServiceImpl implements DemoService {

    @Cacheable(key = "#key")
    @Override
    public String getTime(String key) throws Exception{
        return LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
    }
}
