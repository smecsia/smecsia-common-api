package me.smecsia.common.serialize;

import java.util.Map;

/**
 * Copyright (c) 2012 i-Free. All Rights Reserved.
 *
 * @author Ilya Sadykov
 *         Date: 04.12.12
 *         Time: 11:40
 */
public interface TransportSerializer {

    void registerProcessor(SerializeProcessor processor);

    void registerPostProcessor(SerializePostProcessor processor);

    void registerPreProcessor(SerializePreProcessor processor);

    @SuppressWarnings("unchecked")
    <T extends TransportObject> T deserialize(Class<T> clazz, Object object);

    @SuppressWarnings("unchecked")
    <T extends TransportObject> T deserialize(T instance, Object object);

    @SuppressWarnings("unchecked")
    <T extends TransportObject> Object serialize(T instance);

    <T extends TransportObject> Map<String, String[]> getFieldsOptions(Class<T> clazz);

}
