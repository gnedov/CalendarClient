package com.agn.CalendarClientNew;

import com.agn.clndrclient.CalendarClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyClient implements CalendarClient {
    private List<String> strList = new ArrayList<>();
    private static final Logger LOG = LoggerFactory.getLogger(MyClient.class);

    @Override
    public Collection getLastSearchResult() {
        LOG.debug("getLastSearchResult returned:{}", strList);
        return strList;
    }

    @Override
    public void searchAll() {
        LOG.debug("calling searchAll()");
        strList.clear();
        strList.add("aaa");
        strList.add("bbb");
        strList.add("cccc");
    }

    @Override
    public void searchByTitle(String s) {
        LOG.debug("calling searchByTitle(s) s={}", s);
        strList.clear();
        strList.add(s);
    }

}
