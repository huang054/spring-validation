package com.validation.springvalidation.validation;

import com.validation.springvalidation.validation.constraints.MyCardsValidation;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class MyCardsConstraintValidator implements ConstraintValidator<MyCardsValidation,String> {

    @Override
    public void initialize(MyCardsValidation constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        String[] strings=StringUtils.split(value,"-");
        if (StringUtils.isEmpty(value)||strings.length!=2){
            return false;
        }
        String prefix=strings[0];
        String suffix=strings[1];

        return prefix.equals("huang")&&StringUtils.isNumeric(suffix);
    }
}
