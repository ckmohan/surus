package com.reinvent.surus.model;

import com.reinvent.surus.mapping.*;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Bohdan Mushkevych
 * Description: Example data model with single-component rowKey
 */
public class Example {
    @HRowKey(components = {
             @HFieldComponent(name = Constants.KEY, length = HFieldComponent.LENGTH_VARIABLE, type = byte[].class)
    })
    public byte[] key;

    @HProperty(family = Constants.FAMILY_STAT, identifier = Constants.TIMEPERIOD)
    public int timePeriod;

    @HProperty(family = Constants.FAMILY_STAT, identifier = Constants.DOMAIN_NAME)
    public String domainName;

    @HMapProperty(family = Constants.FAMILY_STAT, identifier = Constants.KEYWORD_INDEX,
            keyType = String.class, valueType = Integer.class)
    public Map<String, Integer> keywordIndex = new HashMap<String, Integer>();

    @HMapFamily(family = Constants.FAMILY_KEYWORD, keyType = String.class, valueType = Integer.class)
    public Map<String, Integer> keyword = new HashMap<String, Integer>();

    @HMapFamily(family = Constants.FAMILY_OS, keyType = String.class, valueType = Map.class)
    @HNestedMap(keyType = String.class, valueType = Integer.class)
    public Map<String, Map<String, Integer>> os = new HashMap<String, Map<String, Integer>>();

    public Example() {
    }
}
