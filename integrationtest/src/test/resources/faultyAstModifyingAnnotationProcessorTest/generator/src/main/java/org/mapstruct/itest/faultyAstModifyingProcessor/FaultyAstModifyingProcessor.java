/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.itest.faultyAstModifyingProcessor;

import javax.lang.model.type.TypeMirror;

import org.mapstruct.ap.spi.AstModifyingAnnotationProcessor;

/**
 * @author Filip Hrisafov
 */
public class FaultyAstModifyingProcessor implements AstModifyingAnnotationProcessor {

    public FaultyAstModifyingProcessor() {
        throw new RuntimeException( "Failed to create processor" );
    }

    @Override
    public boolean isTypeComplete(TypeMirror type) {
        return true;
    }
}
