package com.gaf.coursemanageapp.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckIDValidator implements ConstraintValidator<CheckID, String> {
    @Override
    public void initialize(CheckID constraintAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s == null || s.isEmpty()) return false;

        return  true;
//        return s.startsWith(LODA_PREFIX);
    }
}
