package com.gregorysdtaylor.campaignmap.rest

import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.web.servlet.config.annotation.CorsRegistry

@Configuration
class RestConfiguration: RepositoryRestConfigurer {

    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration, cors: CorsRegistry) {
        cors.addMapping("/**")
            .allowedOrigins("http://localhost:8080", "https://campaign-map-vue2.herokuapp.com")
            .allowedMethods("*")
            .allowedHeaders("*")
    }
}