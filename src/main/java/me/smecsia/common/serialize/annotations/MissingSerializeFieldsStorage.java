package me.smecsia.common.serialize.annotations;

import java.lang.annotation.*;

/**
 * @author Ilya Sadykov
 *         Date: 19.10.12
 *         Time: 14:28
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MissingSerializeFieldsStorage {
}
