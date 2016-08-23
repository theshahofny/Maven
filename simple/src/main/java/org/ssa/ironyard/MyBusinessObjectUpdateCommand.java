
package org.ssa.ironyard;

import com.sun.mep.connector.api.UpdateCommand;
import com.sun.mep.connector.api.BusinessObjectProvider;

public class MyBusinessObjectUpdateCommand 
        extends UpdateCommand<MyBusinessObject> 
{

    public MyBusinessObjectUpdateCommand(MyBusinessObject object) {
        super(object);
    }

    /**
     * Executes this command against a back end. Unchecked exceptions, 
     * such as {@link java.lang.RuntimeException}, can be used to
     * report errors.
     */
    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
