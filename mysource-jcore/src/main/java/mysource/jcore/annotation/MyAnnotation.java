package mysource.jcore.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 使用 @interface 语法定义注解；
 * 配置参数可使用的数据类型：基本数据类型、String、Class、enum；
 * 当注解只有一个配置参数时，该参数的名称默认为value，并且在使用时可以省略；
 * 
 * 元注解说明：
 * Target，限定注解适用的程序元素类型，未使用该元注解时，表示适用于所有程序元素；取值范围参见{@link ElementType}；
 * Retention，限定注解的保留策略；取值范围参见{@link RetentionPolicy}，只有当保留策略被声明为RUNTIME时，才能在运行时通过反射API获取到注解的信息；
 * 
 * @author zhaoyi
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	
	/*该行编译错误，因为配置参数的值必须为编译时的常量
	String desc() default this.getClass().getName();*/
	
	String desc() default "mysource.jcore.annotation.MyAnnotation";
	
	String value() default "";
}
