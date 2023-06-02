package core.core;

import java.util.List;

/**
 * <p>Description: List<ProcessHandler> processHandlerIterator从ioc get
 *
 * @author LiuYi
 * @version 1.0.0
 * @date 2023/6/2
 */
public class BaseProcessInvoke {
    public BaseProcessInvoke(List<ProcessHandler> processHandlerIterator) {
        processHandlerIterator.stream().forEach(e->{
            e.refresh();
        });
    }
}
