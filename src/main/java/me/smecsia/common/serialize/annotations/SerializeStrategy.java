package me.smecsia.common.serialize.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Ilya Sadykov
 *         Date: 19.10.12
 *         Time: 14:28
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SerializeStrategy {
    public static enum Strategy {
        ANNOTATED_FIELDS,
        ALL_FIELDS;
        public static final Strategy DEFAULT = ALL_FIELDS;
    }
    public Strategy type() default Strategy.ALL_FIELDS;
}
