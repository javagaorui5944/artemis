package com.ctrip.soa.artemis.registry;

/**
 * Created by Qiang Zhao on 10/07/2016.
 */
public interface HeartbeatEventListener {

    void onChange(HeartbeatEvent event);

}
