package me.smecsia.common.serialize;

/**
 * @author Ilya Sadykov
 *         Date: 16.11.12
 *         Time: 1:18
 */
public interface SerializePreProcessor {
    public <DT> void process(final DT sourceObject);
}
