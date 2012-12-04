package me.smecsia.common.serialize;

import java.util.Map;

/**
 * Copyright (c) 2012 i-Free. All Rights Reserved.
 *
 * @author Ilya Sadykov
 *         Date: 04.12.12
 *         Time: 11:40
 */
public interface TransportSerializer<ST,DT extends TransportObject> {

    void registerProcessor(SerializeProcessor processor);

    void registerPostProcessor(SerializePostProcessor processor);

    void registerPreProcessor(SerializePreProcessor processor);

    @SuppressWarnings("unchecked")
    DT deserialize(Class<DT> clazz, ST object);

    @SuppressWarnings("unchecked")
    ST deserialize(DT instance, ST object);

    @SuppressWarnings("unchecked")
    Object serialize(ST instance);

    Map<String, String[]> getFieldsOptions(Class<DT> clazz);

}
