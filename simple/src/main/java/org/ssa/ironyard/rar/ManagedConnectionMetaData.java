
package org.ssa.ironyard.rar;

import javax.resource.ResourceException;

public class ManagedConnectionMetaData 
        implements javax.resource.spi.ManagedConnectionMetaData {

	public String getEISProductName() throws ResourceException {
		return "Sun Microsystems MEP Connector";
	}

	public String getEISProductVersion() throws ResourceException {
		return "1.1";
	}

	public String getUserName() throws ResourceException {
		return null;
	}

    public int getMaxConnections() throws ResourceException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
