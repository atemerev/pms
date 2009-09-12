package com.miriamlaurel.pms.examples.async;

import com.miriamlaurel.pms.Asynchronous;
import com.miriamlaurel.pms.Listener;
import com.miriamlaurel.pms.examples.helloworld.Morning;

/**
 * @author Alexander Temerev
 * @version $Id$
 */
public class SleepyMorningHandler {
    @Asynchronous @Listener void $(Morning morning) {
        try {
            System.out.println("RING! RING!");
            System.out.println("Grrr... Have to " +
                    "snooze the alarm clock...");
            Thread.sleep(500);
            System.out.println("WHAT?! I'm late! Oh noes!");
        } catch (InterruptedException e) {
            System.out.println("OK, I'm awake...");
        }
    }
}
