package com.miriamlaurel.pms.listeners;

/**
 * Listener interface for handling protocol messages.
 *
 * @author Alexander Temerev
 * @version $Id:$
 */
public interface MessageListener {
    public void processMessage(Object message);
}
