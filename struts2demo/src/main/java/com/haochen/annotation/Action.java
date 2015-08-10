/**
 * 
 */
package com.haochen.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @title
 * @Description
 * @author chenhao
 * @date 2014年12月3日 下午3:56:47
 * @version 1.0
 */

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Action {
	String name() default "";

	String className() default "";

	String namespace() default "";

	String parentPackage() default "";
}
