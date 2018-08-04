package com.kvn.expensetracker.framework.performance;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceLogging {

	private static Logger logger = org.slf4j.LoggerFactory.getLogger(PerformanceLogging.class);
	@Value("${app.performance.log.enabled:false}")
	private boolean isPerformanceEnabled;

	@Around("@annotation(EnablePerformanceLogging)")
	public Object performanceLog(ProceedingJoinPoint joinPoint) throws Throwable {

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
}
