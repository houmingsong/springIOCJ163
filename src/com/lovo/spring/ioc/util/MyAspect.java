package com.lovo.spring.ioc.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component // 被spring管理
@Aspect // 切面
public class MyAspect {
	// 切点
	@Pointcut("execution(* com.lovo.spring.*.service.*.*(..) )")
	public void mypointCut() {
	};

	// @Before("mypointCut()")
	// public void myNotify(JoinPoint point){
	// String className=point.getSignature().getName();
	// System.out.println("进入"+className+"之前的时间"+System.currentTimeMillis());
	// }
	//
	// @After("mypointCut()")
	// public void myAfterNotify(JoinPoint point){
	// String className=point.getSignature().getName();
	// System.out.println("进入"+className+"之后的时间"+System.currentTimeMillis());
	// }

	@Around("mypointCut()")
	public Object myAround(ProceedingJoinPoint joinPoint) {
		Object obj = null;
		try {
			// 获得调用方法之前的时间
			long startTime = System.currentTimeMillis();
			// 手动调用目标方法
			obj = joinPoint.proceed();
			// 获得调用后的时间
			long endTime = System.currentTimeMillis();
			// 代码运行的时间为
			String methodName = joinPoint.getSignature().getName();
			System.out.println(methodName + "方法运行的时间：" + (endTime - startTime));
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
	}
}
