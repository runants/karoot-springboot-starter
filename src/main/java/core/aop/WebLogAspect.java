package core.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import core.aop.annotations.OperateLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Description:
 *
 * @author LiuYi
 * @version 1.0.0
 * @date 2023/1/18
 */
@Aspect
public class WebLogAspect {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Around("@annotation(operateLog)")
    public Object around(ProceedingJoinPoint joinPoint, OperateLog operateLog) throws Throwable {
        log.info("=========> weblog");
        // 可能也添加了 @ApiOperation 注解
        return null;
    }


    // @Pointcut("execution(* *..*Controller.*(..))")
    // public void webLog(){}
    //
    // @Before("webLog()")
    // public void doBefore(JoinPoint joinPoint) throws Throwable {
    //     // 接收到请求，记录请求内容
    //     // ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    //     // HttpServletRequest request = attributes.getRequest();
    //
    //     // 记录下请求内容
    //     // log.info("开始服务:{}", request.getRequestURL().toString());
    //     // log.info("客户端IP :{}" , request.getRemoteAddr());
    //     // log.info("参数值 :{}", Arrays.toString(joinPoint.getArgs()));
    // }
    //
    // @AfterReturning(returning = "ret", pointcut = "webLog()")
    // public void doAfterReturning(Object ret) throws Throwable {
    //     // 处理完请求，返回内容
    //     log.info("返回值 :{}",ret);
    // }

}
