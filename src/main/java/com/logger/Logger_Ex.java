package com.logger;

import org.apache.log4j.Logger;

public class Logger_Ex {

	static Logger logger = Logger.getLogger(Logger_Ex.class);

	public static void main(String[] args) {
		System.out.println("Printing from System.out.println");

		for(int i=0;i<10;i++) {
			System.out.println("i:" + i);
			logger.info("i:" + i);
			logger.info("Information message");
			logger.debug("debug message");
			logger.warn("warn message");
			logger.error("error message");
			logger.fatal("fatal message");
		}

		method1();

	}

	public static void method1() {
		logger.info("starting method method1");

		int i =10;

		logger.info("i is defined");

		int j =0;
		if(logger.isDebugEnabled()) {
			logger.debug("j is defined");
		}

		int c = i / j;
		if(logger.isDebugEnabled()) {
			logger.info("validation done");
		}


		int d = i / j;

		logger.info("end method of method1");
	}

	public static void method2() {
		logger.info("starting method method2");

		logger.info("end method of method2");
	}
}
