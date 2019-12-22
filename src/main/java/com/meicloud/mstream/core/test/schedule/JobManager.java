package com.meicloud.mstream.core.test.schedule;

import com.meicloud.mstream.core.env.JobEnviroment;

import java.util.Properties;

public interface JobManager {

    Properties getConfig(String str);

    JobEnviroment initJobEnviroment();

    void sumbmit();

    void execute();


}
