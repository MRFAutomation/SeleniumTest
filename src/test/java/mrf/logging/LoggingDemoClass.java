package mrf.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemoClass {
	private static final Logger log = LogManager.getLogger(LoggingDemoClass.class.getName());

	public static void main(String[] args) {
		log.trace("Trace log message");
		log.debug("Debug log message");
		log.info("Info log message");
		log.warn("Warning log message");
		log.error("Error log message");
		log.fatal("Fatal log message");
	}
}
