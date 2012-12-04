package me.smecsia.common.serialize.annotations;

import java.lang.annotation.*;

/**
 * @author Ilya Sadykov
 *         Date: 19.10.12
 *         Time: 14:28
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Serialize {
    public boolean serialize() default true;

    public boolean deserialize() default true;

    public String name() default "";

    public String[] options() default {};

    public static final class DEFAULT {
        public static Serialize get() {
            return new Serialize() {
                @Override
                public boolean serialize() {
                    return true;
                }

                @Override
                public boolean deserialize() {
                    return true;
                }

                @Override
                public String name() {
                    return "";
                }

                @Override
                public String[] options() {
                    return new String[0];
                }

                @Override
                public Class<? extends Annotation> annotationType() {
                    return Serialize.class;
                }
            };
        }
    }
}
