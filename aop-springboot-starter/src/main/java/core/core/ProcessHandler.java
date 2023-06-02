package core.core;

import core.core.entity.Message;

/**
 * <p>Description:
 *
 * @author LiuYi
 * @version 1.0.0
 * @date 2023/6/2
 */
public interface ProcessHandler {
    void register(Message message);

    void refresh();
}
