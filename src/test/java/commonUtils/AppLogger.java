package commonUtils;


import org.apache.log4j.Logger;


//import org.apache.logging.log4j.Logger;

public class AppLogger {

	public static Logger logger;
	
	public AppLogger() {
	logger = Logger.getLogger(AppLogger.class.getName());
	}
	
	public void logInfoMessage(String message) {
		logger.info( message);
	}


	public void logDebugMessage(String message) {
		logger.debug(message);
	}


	public void logErrorMessage(String message) {
		logger.error(message);
	}
	
}
