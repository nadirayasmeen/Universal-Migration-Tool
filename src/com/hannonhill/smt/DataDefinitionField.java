/*
 * Created on Dec 11, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt;

/**
 * Object that stores information about a Cascade data definition field
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class DataDefinitionField extends Field
{
    // Null if not a chooser field
    private final ChooserType chooserType;
    private final boolean multiple;

    /**
     * Constructor for data defintion field
     * 
     * @param identifier
     * @param label
     * @param chooserType
     * @param multiple
     */
    public DataDefinitionField(String identifier, String label, ChooserType chooserType, boolean multiple)
    {
        super(identifier, label);
        this.chooserType = chooserType;
        this.multiple = multiple;
    }

    /**
     * @return Returns the chooserType.
     */
    public ChooserType getChooserType()
    {
        return chooserType;
    }

    /**
     * @return Returns the multiple.
     */
    public boolean isMultiple()
    {
        return multiple;
    }
}
