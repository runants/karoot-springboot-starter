package core.aop;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>Description:
 *
 * @author LiuYi
 * @version 1.0.0
 * @date 2023/1/18
 */
@ConfigurationProperties(prefix = "karoot.syslog")
public class KaLogProperties {
    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
