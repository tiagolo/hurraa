/*
* Hurraa is a web application conceived to manage resources
* in companies that need manage IT resources. Create issues
* and purchase IT materials. Copyright (C) 2014 CEJUG.
*
* Hurraa is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* Hurraa is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with Hurraa. If not, see http://www.gnu.org/licenses/gpl-3.0.html.
*
*/
package org.cejug.hurraa.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;

import org.cejug.hurraa.validation.impl.EquipmentModelNameAvailableValidator;

@Target({ ElementType.PARAMETER , ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { EquipmentModelNameAvailableValidator.class })
@ReportAsSingleViolation
@Documented
public @interface EquipmentModelNameAvailable {
    
    String message() default "{already_in_use}";
    
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    
}
