
package org.ssa.ironyard;

import java.util.List;

import com.sun.mep.connector.api.BusinessObjectProvider;
import com.sun.mep.connector.api.SessionContext;

public class MyBusinessObjectProvider extends BusinessObjectProvider<MyBusinessObject> {

    public MyBusinessObjectProvider() {
    }
    
   /**
    * This method is called right after an instance of this class
    * is created. It can be used to allocate resources for the
    * duration of a synchronization session. Other uses of this 
    * method include back-end authentication. Credentials needed
    * for authentication are available from the {@link SessionContext}
    * which can be accessed via {@link #getSessionContext()}. 
    * 
    * @see #terminate()
    */
    @Override
    public void initialize() {
    }
    
    /**
     * This method is called when a synchronization session is 
     * about to be terminated. Any resources allocated by this object 
     * should be freed at this point. 
     * 
     * @see #initialize()
     */
    @Override
    public void terminate() {
    }
    
    /**
     * Returns the name of the repository holding these objects.
     */
    @Override
    public String getRepositoryName() {
        return "MyRepository";
    }

   /**
     * Returns a complete list of the business objects available in
     * the back end associated with this provider. This is in
     * essence a query method for all the instances in the back end.
     */
    @Override
    public List<MyBusinessObject> getBusinessObjects() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    /**
     * Returns a fresh instance of a business object.
     */
    @Override
    public MyBusinessObject newBusinessObject() {
        return new MyBusinessObject(this);
    }
        
}
