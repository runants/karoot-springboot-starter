package org.karoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Description:
 *
 * @author LiuYi
 * @version 1.0.0
 * @date 2023/1/18
 */
@ConditionalOnProperty(prefix = "spring.karoot", name = "enabled", havingValue = "true")
@EnableConfigurationProperties(KaRootProperties.class)
@Configuration
public class HbaseAutoConfiguration {

    @Bean
    public Object hbaseConnectPool(){
        System.out.println("sss");
        return new Integer(10);
    }
}
