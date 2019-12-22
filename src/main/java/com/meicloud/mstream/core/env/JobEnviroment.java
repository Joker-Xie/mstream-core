package com.meicloud.mstream.core.env;

public interface JobEnviroment<T> {

    void setConf();

    void register();

    JobEnviroment getJobEnv();

}
