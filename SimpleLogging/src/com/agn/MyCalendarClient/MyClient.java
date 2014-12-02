package com.agn.MyCalendarClient;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.agn.clndrclient.CalendarClient;
import org.apache.log4j.Logger;

public class MyClient implements CalendarClient {
    private List<String> strList = new ArrayList<>();
    private static final Logger LOG = Logger.getLogger(MyClient.class);

    @Override
    public Collection getLastSearchResult() {
        LOG.info("returned last search result");
        if(strList.size() == 0)
            LOG.warn("Nothing found!");
        return strList;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void searchAll() {
        LOG.debug("call searchAll()");
        strList.clear();
        strList.add("111");
        strList.add("222");
        strList.add("3333");
    }

    @Override
    public void searchByTitle(String s) {
        strList.clear();
        strList.add(s);
        //To change body of implemented methods use File | Settings | File Templates.
    }

}
