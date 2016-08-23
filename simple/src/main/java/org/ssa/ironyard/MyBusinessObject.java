
package org.ssa.ironyard;

import java.io.IOException;

import com.sun.mep.connector.api.BusinessObject;

public class MyBusinessObject extends BusinessObject<MyBusinessObjectProvider> {

    public MyBusinessObject(MyBusinessObjectProvider provider) {
        super(provider);
    }
    
    /**
     * Returns the default extension for business objects of
     * this type. Extensions are used by the files holding these 
     * objects and must be part of the contract with clients. 
     * That is, clients and connectors must use the same extension
     * for the same type of business object. Concrete subclasses 
     * should re-defined this method.
     */
    @Override
    public String getExtension() {
        return ".obj";
    }
     
    /**
     * Serializes a business object into a byte array.
     */
    @Override
    public byte[] serialize() throws IOException {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Deserializes a business object from a byte array.
     */
    @Override
    public void deserialize(byte[] array) throws IOException {
        throw new UnsupportedOperationException("Not implemented");

    }
    
    /**
     * Returns a command that when executed can insert this
     * business object into a back end.
     */
    @Override
    public MyBusinessObjectInsertCommand getInsertCommand() {
        return new MyBusinessObjectInsertCommand(this);
    }
    
    /**
     * Returns a command that when executed can update this
     * business object in a back end.
     */
    @Override
    public MyBusinessObjectUpdateCommand getUpdateCommand() {
        return new MyBusinessObjectUpdateCommand(this);
    }
    
    /**
     * Returns a command that when executed can delete this
     * business object from a back end.
     */
    @Override
    public MyBusinessObjectDeleteCommand getDeleteCommand() {
        return new MyBusinessObjectDeleteCommand(this);
    }
        
}

