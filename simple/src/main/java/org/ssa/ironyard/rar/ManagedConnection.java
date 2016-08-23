
package org.ssa.ironyard.rar;

import org.ssa.ironyard.MyBusinessObjectProvider;

import java.io.PrintWriter;

import javax.jcr.Repository;
import javax.resource.ResourceException;
import javax.resource.spi.ConnectionEventListener;
import javax.resource.spi.ConnectionRequestInfo;
import javax.resource.spi.LocalTransaction;
import javax.security.auth.Subject;
import javax.transaction.xa.XAResource;

import com.sun.mep.connector.jcr.DbRepository;

public class ManagedConnection implements javax.resource.spi.ManagedConnection {

    static Repository repository;
    
    static {
        System.out.println("DbRepositoryManagedConnection loaded by " + ManagedConnection.class.getClassLoader());
    }

    public void addConnectionEventListener(ConnectionEventListener listener) {
    }

    public void associateConnection(Object connection) throws ResourceException {
    }

    public void cleanup() throws ResourceException {
    }

    public void destroy() throws ResourceException {
        repository = null;
    }

    public Object getConnection(Subject subject,
            ConnectionRequestInfo cxRequestInfo) throws ResourceException {
        if (repository == null) {
            repository = new DbRepository(
                    MyBusinessObjectProvider.class.getName());
        }
        return repository;
    }

    public LocalTransaction getLocalTransaction() throws ResourceException {
        return null;
    }

    public PrintWriter getLogWriter() throws ResourceException {
        return null;
    }

    public javax.resource.spi.ManagedConnectionMetaData getMetaData() throws ResourceException {
        return new ManagedConnectionMetaData();
    }

    public XAResource getXAResource() throws ResourceException {
        return null;
    }

    public void removeConnectionEventListener(ConnectionEventListener listener) {
    }

    public void setLogWriter(PrintWriter out) throws ResourceException {
    }
}
