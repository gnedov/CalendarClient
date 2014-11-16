package com.agn.MyCalendarClient;


import com.agn.cmdparser.ConsoleInput;
import com.agn.clndrclient.CalendarClient;
import org.apache.log4j.Logger;

/* This application is only for test log4j ->  log4j  bundle.
- log4j (v.1.2.17) used in ArgsParser-1.0-SNAPSHOT.jar external library;
AND in this    SimpleLogging module of CalendarClient project.
 */

public class Main {
    public static void main(String[] args) {
        Logger LOG = Logger.getLogger(Main.class);

        LOG.info(" Main class started");
        CalendarClient myClient = new MyClient();

        ConsoleInput consoleInput = new ConsoleInput(myClient);
        if (LOG.isDebugEnabled())
            LOG.debug("try to startConsole ");
        consoleInput.startConsole(args);
    }
}
