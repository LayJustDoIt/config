package org.lay.config.service.impl;

import org.lay.config.service.EnvService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Create by Lay
 * 2018-03-25 10:29
 */
@Service
public class EnvServiceImpl implements EnvService {

    @Value("${spring.application.name}")
    private String env;

    @Override
    public String getEnv() {
        return env;
    }
}
