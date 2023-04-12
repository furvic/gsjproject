package com.ujiuye.anni;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Person {
    String wife();
    String hunsband() default "丈夫";
    String action() default "喝药";

}
