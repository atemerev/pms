package com.miriamlaurel.pms.examples.routine;

import com.miriamlaurel.pms.examples.helloworld.Evening;
import com.miriamlaurel.pms.examples.helloworld.HelloWorldHandler;
import com.miriamlaurel.pms.examples.helloworld.Morning;
import com.miriamlaurel.pms.listeners.dispatch.DispatchListener;

/**
 * @author Alexander Temerev
 * @version $Id$
 */
public class Main {
    public static void main(String[] args) {
        Life life = new Life();
        DispatchListener helloWorld
                = new DispatchListener(new HelloWorldHandler());
        DailyRoutineHandler dailyRoutine
                = new DailyRoutineHandler();
        life.listeners().add(helloWorld);
        life.listeners().add(dailyRoutine);
        life.processMessage(new Morning());
        life.processMessage(new Evening());
    }
}
