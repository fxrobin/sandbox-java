package com.widedot.sandbox;

import org.apache.commons.lang3.SystemUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainProg {

	static final Logger logger = LogManager.getLogger(MainProg.class);
	
	public static void main(String[] args) {
		
		logger.info("sandbox-java");
		logger.info("plateform : {}, version : {}", SystemUtils.OS_NAME, SystemUtils.OS_VERSION);
		logger.info("is windows ? {}", SystemUtils.IS_OS_WINDOWS);
		logger.info("is linux   ? {}", SystemUtils.IS_OS_LINUX);
		logger.info("is macosx  ? {}", SystemUtils.IS_OS_MAC_OSX);
		
	}

}
