package cn.spring.aop;

import java.util.Arrays;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
/*
定义包含增强方法的javabean
添加日志处理
 */
public class UserServiceLogger {
	private static final Logger log = Logger.getLogger(UserServiceLogger.class);

	//前置增强
	public void before(JoinPoint jp) {
	    log.info("调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName()
	            + " 方法。方法入参：" + Arrays.toString(jp.getArgs()));
	}
	//后置增强的方法

	/**
	 *
	 * @param jp  连接点
	 * @param result
	 */
	public void afterReturning(JoinPoint jp, Object result) {
	    log.info("调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName()
	            + " 方法。方法返回值：" + result);
	}

}