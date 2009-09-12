package com.miriamlaurel.pms.examples.routine;

import com.miriamlaurel.pms.Listener;
import com.miriamlaurel.pms.examples.helloworld.Evening;
import com.miriamlaurel.pms.examples.helloworld.Morning;
import com.miriamlaurel.pms.listeners.dispatch.DispatchListener;

/**
 * @author Alexander Temerev
 * @version $Id$
 */
public class DailyRoutineHandler extends DispatchListener {
    @Listener void $(Morning morning) {
        System.out.println("Making bed...");
        System.out.println("Brushing teeth...");
        System.out.println("Shaving...");
    }

    @Listener void $(Evening evening) {
        System.out.println("Taking shower...");
        System.out.println("Going to sleep...");
    }
}
