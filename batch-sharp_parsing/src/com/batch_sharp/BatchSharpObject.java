package com.batch_sharp;

/**
 * Created by tobe on 5/31/2015.
 */
public class BatchSharpObject {

    public String SourceText;
    public BatchSharpTypes Type;
    public Object Value;

    public BatchSharpObject(Object value, BatchSharpTypes type, String sourceText) {
        SourceText = sourceText;
        Type = type;
        Value = value;
    }

    public enum BatchSharpTypes {
        Number,
        String,
        Null,
        Miscellaneous
    }
}
