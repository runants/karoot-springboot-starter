package core.core;

import core.core.entity.Message;

/**
 * <p>Description:
 *
 * @author LiuYi
 * @version 1.0.0
 * @date 2023/6/2
 */
public class BaProcessHandlerImpl implements ProcessHandler{
    @Override
    public void register(Message message) {
        message.setMessage("BaProcessHandlerImpl");
        System.out.println("message = " + message);
    }

    @Override
    public void refresh() {
        System.out.println("BaProcessHandlerImpl = " + true);
    }
}
