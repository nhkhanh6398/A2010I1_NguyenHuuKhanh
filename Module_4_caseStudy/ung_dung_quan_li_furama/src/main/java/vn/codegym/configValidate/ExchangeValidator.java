//package vn.codegym.configValidate;
//
//import org.springframework.stereotype.Service;
//import org.springframework.validation.Errors;
//import org.springframework.validation.ValidationUtils;
//import org.springframework.validation.Validator;
//
//@Service
//public class ExchangeValidator implements Validator {
//    @Override
//    public boolean supports(Class<?> clazz) {
//        return false;
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//        ValidationUtils.rejectIfEmpty(errors,"employee","employee.empty");
//    }
//}
