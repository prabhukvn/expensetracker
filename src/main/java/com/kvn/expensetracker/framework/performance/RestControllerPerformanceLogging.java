package com.kvn.expensetracker.framework.performance;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RestControllerPerformanceLogging {

	private static Logger logger = org.slf4j.LoggerFactory.getLogger(RestControllerPerformanceLogging.class);
	@Value("${app.performance.log.enabled:false}")
	private boolean isPerformanceEnabled;

	@Around("@annotation(org.springframework.web.bind.annotation.GetMapping)")
	public Object performanceLogGetMapping(ProceedingJoinPoint joinPoint) throws Throwable {

		return perform(joinPoint);
	}
	private Object perform(ProceedingJoinPoint joinPoint) throws Throwable {
		if (!isPerformanceEnabled) {
			return joinPoint.proceed();
		}
		final long start = System.currentTimeMillis();

		final Object proceed = joinPoint.proceed();

		final long executionTime = System.currentTimeMillis() - start;
		logger.info("Execution Time -->:"+joinPoint.getTarget().getClass().getName() + "_" + joinPoint.getSignature().getName() + ":"
				+ executionTime+"ms");
		return proceed;
	}
	@Around("@annotation(org.springframework.web.bind.annotation.PostMapping)")
	public Object performanceLogPostMapping(ProceedingJoinPoint joinPoint) throws Throwable {

		return perform(joinPoint);
	}
	@Around("@annotation(org.springframework.web.bind.annotation.PutMapping)")
	public Object performanceLogPutMapping(ProceedingJoinPoint joinPoint) throws Throwable {

		return perform(joinPoint);
	}
	@Around("@annotation(org.springframework.web.bind.annotation.DeleteMapping)")
	public Object performanceLogDeleteMapping(ProceedingJoinPoint joinPoint) throws Throwable {

		return perform(joinPoint);
	}
}
