
package org.ssa.ironyard.rar;

import java.io.PrintWriter;
import java.util.Set;

import javax.naming.NamingException;
import javax.naming.Reference;
import javax.resource.Referenceable;
import javax.resource.ResourceException;
import javax.resource.spi.ConnectionManager;
import javax.resource.spi.ConnectionRequestInfo;
import javax.security.auth.Subject;

public class ManagedConnectionFactory implements
		javax.resource.spi.ManagedConnectionFactory, Referenceable
{
    
	private static final long serialVersionUID = 9113066633011227779L;

	private static ManagedConnectionFactory factoryInstance = null;

	private static ManagedConnection connectionInstance = null;

    private Reference reference;

	public ManagedConnectionFactory() {
    }

	public Object createConnectionFactory() throws ResourceException {
		if (factoryInstance == null)
			factoryInstance = new ManagedConnectionFactory();
		return factoryInstance;
	}

	public Object createConnectionFactory(ConnectionManager cxManager)
			throws ResourceException {
		if (factoryInstance == null)
			factoryInstance = new ManagedConnectionFactory();
		return factoryInstance;
	}

	public ManagedConnection createManagedConnection(Subject subject,
			ConnectionRequestInfo cxRequestInfo) throws ResourceException {
		if (connectionInstance == null) {
			connectionInstance = new ManagedConnection();
		}
		return connectionInstance;
	}

	public ManagedConnection matchManagedConnections(Set connectionSet,
			Subject subject, ConnectionRequestInfo cxRequestInfo)
			throws ResourceException {
		if (connectionInstance == null) {
			connectionInstance = new ManagedConnection();
		}
		return connectionInstance;
	}

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof ManagedConnectionFactory);  // singleton
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void setReference(Reference arg0) {
        reference = arg0;
    }

    public Reference getReference() throws NamingException {
        return reference;
    }

	public PrintWriter getLogWriter() throws ResourceException {
		return null;
	}

	public void setLogWriter(PrintWriter out) throws ResourceException {
	}

}
