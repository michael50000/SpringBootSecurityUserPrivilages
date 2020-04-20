package com.Clover.springboot.Aspect;

import java.util.List;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.Clover.springboot.Model.Student;

@Aspect
@Component
public class LoggingAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(public * getStudents())")
	public void loggingAdvice(){
		//System.out.println("Inside logging aspect");
		logger.info("Inside logging aspect");
		
	}

}
