/*
 * /* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/. */
package pt.webdetails.cpf.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import pt.webdetails.cpf.utils.MimeTypes;

/**
 *
 * @author pdpi
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Exposed {
    
    AccessLevel accessLevel() default AccessLevel.PUBLIC;
    
    String role() default "";
    
    String outputType() default MimeTypes.HTML;
}