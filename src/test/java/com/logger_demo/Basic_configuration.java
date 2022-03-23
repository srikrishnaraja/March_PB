package com.logger_demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_configuration {
	
	
	//factory design pattern
	
	public static Logger log = Logger.getLogger(Basic_configuration.class);
	
	
	public static void main (String[]args) {
	
	BasicConfigurator.configure();
		
	log.debug("debug");
	
	log.info("info");
	
	log.warn("warn");
	
	log.error("error");
	
	log.fatal("fatel");
	
	}

}
