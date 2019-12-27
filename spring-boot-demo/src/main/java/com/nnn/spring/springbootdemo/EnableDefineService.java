package com.nnn.spring.springbootdemo;

import org.springframework.boot.autoconfigure.AutoConfigurationImportSelector;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(AutoConfigurationImportSelector.class)
public @interface EnableDefineService {
}
