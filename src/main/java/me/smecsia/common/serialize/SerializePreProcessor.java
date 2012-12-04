package me.smecsia.common.serialize;

/**
 * Copyright (c) 2012 i-Free. All Rights Reserved.
 *
 * @author Ilya Sadykov
 *         Date: 16.11.12
 *         Time: 1:18
 */
public interface SerializePreProcessor<DT extends TransportObject> {
    public <DT> void process(final DT sourceObject);
}
