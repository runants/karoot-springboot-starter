package core.core;

import core.core.entity.Message;

/**
 * <p>Description:
 *
 * @author LiuYi
 * @version 1.0.0
 * @date 2023/6/2
 */
public class CaProcessHandlerImpl implements ProcessHandler{
    @Override
    public void register(Message message) {

    }

    @Override
    public void refresh() {
        System.out.println("CaProcessHandlerImpl = " + true);
    }
}
