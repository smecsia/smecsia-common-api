package me.smecsia.common.serialize;

import java.util.Map;

/**
 * @author Ilya Sadykov
 *         Date: 04.12.12
 *         Time: 11:40
 */
public interface TransportSerializer<ST> {

    void registerProcessor(SerializeProcessor processor);

    void registerPostProcessor(SerializePostProcessor processor);

    void registerPreProcessor(SerializePreProcessor processor);

    @SuppressWarnings("unchecked")
    <DT extends TransportObject> DT deserialize(Class<DT> clazz, ST object);

    @SuppressWarnings("unchecked")
    <DT extends TransportObject> DT deserialize(DT instance, ST object);

    @SuppressWarnings("unchecked")
    <DT extends TransportObject> ST serialize(DT instance);

    <DT extends TransportObject> Map<String, String[]> getFieldsOptions(Class<DT> clazz);

}
