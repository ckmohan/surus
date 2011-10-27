package com.reinvent.synergy.data.system;

import org.apache.hadoop.hbase.mapreduce.TableMapper;
import org.apache.hadoop.hbase.mapreduce.TableReducer;

/**
 * @author Bohdan Mushkevych
 *         date: 29/08/11
 *         Description: defines common properties for SynergyProcess
 */
public class SynergyProcess {
    private String name;
    private String tableSource;
    private String tableTarget;
    private TimeQualifier qualifier;
    private AbstractPrimaryKey primaryKey;
    private Class<? extends TableMapper> mapper;
    private Class combiner;
    private Class<? extends TableReducer> reducer;

    public SynergyProcess(String name,
                          String tableSource,
                          String tableTarget,
                          TimeQualifier qualifier,
                          AbstractPrimaryKey primaryKey,
                          Class<? extends TableMapper> mapper,
                          Class combiner,
                          Class<? extends TableReducer> reducer) {
        this.name = name;
        this.tableSource = tableSource;
        this.tableTarget = tableTarget;
        this.qualifier = qualifier;
        this.primaryKey = primaryKey;
        this.mapper = mapper;
        this.combiner = combiner;
        this.reducer = reducer;
    }

    public String getName() {
        return name;
    }

    public String getTableSource() {
        return tableSource;
    }

    public String getTableTarget() {
        return tableTarget;
    }

    public TimeQualifier getQualifier() {
        return qualifier;
    }

    public AbstractPrimaryKey getPrimaryKey() {
        return primaryKey;
    }

    public Class<? extends TableMapper> getMapperClass() {
        return mapper;
    }

    public Class getCombinerClass() {
        return combiner;
    }

    public Class<? extends TableReducer> getReducerClass() {
        return reducer;
    }
}
