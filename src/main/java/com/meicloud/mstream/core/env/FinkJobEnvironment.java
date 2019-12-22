package com.meicloud.mstream.core.env;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.java.StreamTableEnvironment;

public class FinkJobEnvironment implements JobEnviroment {
    private StreamExecutionEnvironment env;
    private StreamTableEnvironment tblEnv;

    public StreamExecutionEnvironment getEnv() {
        return env;
    }

    public StreamTableEnvironment getTblEnv() {
        return tblEnv;
    }

    private static FinkJobEnvironment instance;

    public static FinkJobEnvironment getInstance() {
        if (instance == null) {
            instance = new FinkJobEnvironment();
        }
        return instance;
    }

    private FinkJobEnvironment() {
        this.env = StreamExecutionEnvironment.getExecutionEnvironment();
    }

    @Override
    public void setConf() {

    }

    @Override
    public void register() {
    }

    @Override
    public JobEnviroment getJobEnv() {
        return this;
    }
}
