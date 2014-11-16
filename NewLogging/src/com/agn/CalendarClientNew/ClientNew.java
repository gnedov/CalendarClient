package com.agn.CalendarClientNew;

import com.agn.clndrclient.CalendarClient;
import com.agn.cmdparser.ConsoleInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* This application is only for test log4j -> slf4j -> logback bundle.
- log4j (v.1.2.17) used in ArgsParser-1.0-SNAPSHOT.jar external library;
- slf4j (v.1.7.7) as logging interface framework in com.agn.CalendarClientNew
- logback (v.1.1.2) as implementation of logging.
 */
/*
see http://logback.qos.ch/translator/   to get  logback.xml from log4j.properties
*/
public class ClientNew {
    private static final Logger LOG = LoggerFactory.getLogger(ClientNew.class);

    public static void main(String[] args) {
        System.out.println("hello from ClientNew main");
        LOG.info("Application has been started");
        CalendarClient myClient = new MyClient();

        ConsoleInput consoleInput = new ConsoleInput(myClient);
        LOG.debug("try to startConsole ");
        consoleInput.startConsole(args);
        LOG.info("Application has been closed ");

    }
}
