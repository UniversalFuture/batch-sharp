package com.batch_sharp;

import org.antlr.v4.runtime.misc.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by tobe on 5/30/2015.
 */
public class BatchSharpCompiler extends BatchSharpBaseVisitor<BatchSharpObject> {

    FileOutputStream fileOutputStream;

    public BatchSharpCompiler(String outputFileName) throws FileNotFoundException, IOException {
        File file = new File(outputFileName);
        if (file.exists()) {
            file.delete();
            file.createNewFile();
        } else {
            file.createNewFile();
        }
        fileOutputStream = new FileOutputStream(outputFileName);
    }

    @Override
    public BatchSharpObject visitCall(@NotNull BatchSharpParser.CallContext ctx) {
        return super.visitCall(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public BatchSharpObject visitNum(@NotNull BatchSharpParser.NumContext ctx) {
        return new BatchSharpObject(Double.parseDouble(ctx.getText()), BatchSharpObject.BatchSharpTypes.Number, ctx.getText());
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public BatchSharpObject visitNumber(@NotNull BatchSharpParser.NumberContext ctx) {
        if (ctx.hex() != null) {
            return new BatchSharpObject(Integer.parseInt(ctx.hex().value.getText()), BatchSharpObject.BatchSharpTypes.Number, ctx.getText());
        } else {
            return super.visitNum(ctx.num());
        }
    }
}
