package mysource.jcore.annotation.createdb;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 使用该注解标记对字段的约束
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Contraints {

	boolean primarykey() default false;
	boolean allownull() default true;
	boolean unique() default false;
}
