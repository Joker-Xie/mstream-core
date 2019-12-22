package com.meicloud.mstream.core.env;

public class SparkJobEnviroment implements JobEnviroment {

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
