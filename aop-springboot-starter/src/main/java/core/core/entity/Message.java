package core.core.entity;

import lombok.Data;

import java.util.Map;

/**
 * <p>Description:
 *
 * @author LiuYi
 * @version 1.0.0
 * @date 2023/6/2
 */
@Data
public class Message {
    private String message;
    private Map<String,Object> body;
}
