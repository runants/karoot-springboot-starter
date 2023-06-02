package core.core;

import core.core.ProcessHandler;

import java.util.Iterator;

/**
 * <p>Description:
 *
 * @author LiuYi
 * @version 1.0.0
 * @date 2023/6/2
 */
public class BaseProcessInvoke {
    public BaseProcessInvoke(Iterator<ProcessHandler> processHandlerIterator) {
        if (processHandlerIterator.hasNext()) {
            processHandlerIterator.next().refresh();
        }
    }
}
