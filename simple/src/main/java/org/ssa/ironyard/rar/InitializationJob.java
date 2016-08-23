
package org.ssa.ironyard.rar;

import java.util.logging.Logger;
import javax.resource.spi.work.Work;
import com.sun.mep.connector.ConnectorLogger;

public class InitializationJob implements Work {

	private static final Logger logger = ConnectorLogger.getLogger();

	public void run() {
		logger.info("Starting DbRepository connector.");
	}

	public void release() {
		logger.info("Releasing DbRepository connector resources.");
	}

}
