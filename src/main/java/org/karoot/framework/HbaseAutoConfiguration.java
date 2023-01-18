package org.karoot.framework;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
    protected final Log logger = LogFactory.getLog(this.getClass());


    @Bean
    public Object hbaseConnectPool(){
        logger.info("------------>:karoot-springboot-starter start!");
        return new Integer(10);
    }
}
