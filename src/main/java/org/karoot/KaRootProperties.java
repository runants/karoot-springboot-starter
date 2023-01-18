package org.karoot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>Description:
 *
 * @author LiuYi
 * @version 1.0.0
 * @date 2023/1/18
 */
@ConfigurationProperties(
        prefix = KaRootProperties.PREFIX,
        ignoreUnknownFields = false
)

public class KaRootProperties {
    public static final String PREFIX = "spring.karoot";
    /**
     * 地址
     */
    private String host = "localhost";

    /**
     * 端口
     */
    private String port = "2181";

    /**
     * 版本
     */
    private String version = "V1.0";

    private String enabled = "false";


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
