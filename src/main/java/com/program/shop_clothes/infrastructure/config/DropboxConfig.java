package com.program.shop_clothes.infrastructure.config;


import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DropboxConfig {


    @Value("${dropbox.access.token}")
    private String accessToken;

    @Bean
    public DbxClientV2 dropboxClient() {
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/shop_clothes").build();
        return new DbxClientV2(config, accessToken);
    }


}
