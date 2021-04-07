package com.anyang.myWeb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = { "classpath:springConfig/application-servelet.xml"})
public class MyWebConfig {
}
