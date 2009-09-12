package com.miriamlaurel.pms.examples.routine;

import com.miriamlaurel.pms.listeners.HasMessageListeners;
import com.miriamlaurel.pms.listeners.MessageListener;
import com.miriamlaurel.pms.listeners.MessageListenerDelegate;

import java.util.List;

/**
 * @author Alexander Temerev
 * @version $Id$
 */
public class Life implements MessageListener, HasMessageListeners {

    private MessageListenerDelegate delegate
            = new MessageListenerDelegate();

    // Delegated methods...

    public void processMessage(Object message) {
        delegate.processMessage(message);
    }

    public List<MessageListener> listeners() {
        return delegate.listeners();
    }

    // Some other methods which may be useful in Life...
    // ...
}
