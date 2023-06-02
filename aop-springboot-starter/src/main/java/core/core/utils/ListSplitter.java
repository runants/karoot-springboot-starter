package core.core.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * <p>Description: 迭代执行最大限制条数
 *
 * @author LiuYi
 * @version 1.0.0
 * @date 2023/6/2
 */
public class ListSplitter implements Iterator<List<Map>> {

    private final List<Map> message;
    private static final int SIZE_LIMIT = 10 * 1000;
    private int currentIndex;

    public ListSplitter(List<Map> message) {
        this.message = message;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < message.size();
    }

    /**
     * 工具类作为参考，以实际业务为准！
     * @return {@link List}
     */
    @Override
    public List<Map> next() {
        int nextIndex = currentIndex;
        int totalSize = 0;
        for (; nextIndex < message.size(); nextIndex++) {
            Map map = message.get(nextIndex);
            int messageSize = map.size();

            if (messageSize > SIZE_LIMIT) {
                // 第一次发送就超过了限制，直接跳过这小消息继续扫描
                if (nextIndex - currentIndex == 0) {
                    nextIndex++;
                }
                break;
            }

            // 如果当前发送到列表已经超出限制，暂停添加消息
            if (messageSize + totalSize > SIZE_LIMIT) {
                break;
            } else {
                totalSize += messageSize;
            }
        }
        List<Map> message = this.message.subList(currentIndex, nextIndex);
        currentIndex = nextIndex;
        return message;
    }
}
