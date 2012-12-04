package me.smecsia.common.serialize;

import me.smecsia.common.serialize.annotations.MissingSerializeFieldsStorage;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ilya Sadykov
 *         Date: 05.12.12
 *         Time: 0:48
 */
public class BasicTransportObject implements TransportObject {
    @MissingSerializeFieldsStorage
    private Map<String, Object> fields = new HashMap<String, Object>();

    public Map<String, Object> getFields() {
        return fields;
    }

    public void setFields(Map<String, Object> fields) {
        this.fields = fields;
    }

    public void put(String key, Object value) {
        getFields().put(key, value);
    }

    public Object get(String key) {
        return getFields().get(key);
    }
}
