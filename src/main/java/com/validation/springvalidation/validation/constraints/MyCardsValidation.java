package com.validation.springvalidation.validation.constraints;

import com.validation.springvalidation.validation.MyCardsConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(FIELD)
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = MyCardsConstraintValidator.class)
public @interface MyCardsValidation {


    String message() default "{javax.validation.constraints.MyCardsValidation.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
