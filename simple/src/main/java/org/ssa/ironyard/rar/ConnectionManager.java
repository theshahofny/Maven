
package org.ssa.ironyard.rar;

import java.io.Serializable;
import javax.resource.ResourceException;
import javax.resource.spi.ConnectionRequestInfo;
import javax.resource.spi.ManagedConnectionFactory;

/**
 * Class needed to expose MEP connectors as J2EE connectors.
 *
 * @author Santiago.PericasGeertsen@sun.com
 */
public class ConnectionManager
        implements javax.resource.spi.ConnectionManager, Serializable {

	private static final long serialVersionUID = 9113066633011227778L;
    
    public Object allocateConnection(ManagedConnectionFactory factory,
            ConnectionRequestInfo info) throws ResourceException {
        return factory.createManagedConnection(null, info);
    }

}
