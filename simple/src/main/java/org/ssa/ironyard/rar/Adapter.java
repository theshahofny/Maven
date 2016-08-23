
package org.ssa.ironyard.rar;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.resource.NotSupportedException;
import javax.resource.ResourceException;
import javax.resource.spi.ActivationSpec;
import javax.resource.spi.BootstrapContext;
import javax.resource.spi.ResourceAdapter;
import javax.resource.spi.ResourceAdapterInternalException;
import javax.resource.spi.endpoint.MessageEndpointFactory;
import javax.resource.spi.work.WorkException;
import javax.resource.spi.work.WorkManager;
import javax.transaction.xa.XAResource;

import com.sun.mep.connector.ConnectorLogger;

public class Adapter implements ResourceAdapter, Serializable {

	private static final long serialVersionUID = -5859489821509442296L;

	private static final Logger logger = ConnectorLogger.getLogger();

	public void endpointActivation(MessageEndpointFactory endpointFactory,
			ActivationSpec spec) throws ResourceException {
		throw new NotSupportedException(
				"DbRepositoryAdapter does not support endPointActivation.");
	}

	public void endpointDeactivation(MessageEndpointFactory endpointFactory,
			ActivationSpec spec) {
	}

	public XAResource[] getXAResources(ActivationSpec[] specs)
			throws ResourceException 
    {
		return null;
	}

	public void start(BootstrapContext ctx) 
            throws ResourceAdapterInternalException 
    {
		logger.fine("Bootstrapping the DbRepositoryAdapter.");
		WorkManager wManager = ctx.getWorkManager();
		try {
			wManager.doWork(new InitializationJob());
		} 
        catch (WorkException e) {
            throw new RuntimeException(e);
		}
	}

	public void stop() {
	}

}
