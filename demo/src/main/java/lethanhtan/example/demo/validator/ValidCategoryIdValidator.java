package lethanhtan.example.demo.validator;

import jakarta.validation.ConstraintValidatorContext;
import lethanhtan.example.demo.Entity.Category;
import lethanhtan.example.demo.validator.annotation.ValidCategoryId;
import jakarta.validation.ConstraintValidator;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category>{
    @Override
    public boolean isValid (Category category, ConstraintValidatorContext context){
        return category != null && category.getId() != null;
    }


}
