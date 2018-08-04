package org.lay.config.controller;

import org.lay.config.service.EnvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by Lay
 * 2018-03-25 10:26
 */
@RestController
@RequestMapping("/env")
public class EnvController {

    @Autowired
    private EnvService envService;

    @GetMapping("/print")
    public String getEnv() {
        return envService.getEnv();
    }
}
