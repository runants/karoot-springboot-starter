package org.karoot.framework.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
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
@Configuration
@EnableConfigurationProperties({KaLogProperties.class})
@ConditionalOnProperty(prefix = "karoot.syslog",
        value = "enabled",havingValue = "true")
public class KaLogAutoConfiguration {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Bean
    // @ConditionalOnMissingBean
    public WebLogAspect webLogAspect(){
        log.info("------> webLogAspect is enabled!");
        return new WebLogAspect();
    }
}
