package me.smecsia.common.serialize;

import com.smartfoxserver.v2.entities.data.ISFSObject;
import me.smecsia.smartfox.tools.common.TransportObject;

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
    <T extends TransportObject> T deserialize(Class<T> clazz, ISFSObject object);

    @SuppressWarnings("unchecked")
    <T extends TransportObject> T deserialize(T instance, ISFSObject object);

    @SuppressWarnings("unchecked")
    <T extends TransportObject> ISFSObject serialize(T instance);

    <T extends TransportObject> Map<String, String[]> getFieldsOptions(Class<T> clazz);

}
