package me.smecsia.common.serialize;

import me.smecsia.smartfox.tools.common.TransportObject;

/**
 * Copyright (c) 2012 i-Free. All Rights Reserved.
 *
 * @author Ilya Sadykov
 *         Date: 16.11.12
 *         Time: 1:18
 */
public interface SerializePreProcessor {
    public <T extends TransportObject> void process(final T sourceObject);
}
