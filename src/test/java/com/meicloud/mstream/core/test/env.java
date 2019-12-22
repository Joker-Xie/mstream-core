package com.meicloud.mstream.core.test;

import com.meicloud.mstream.core.env.FinkJobEnvironment;
import com.meicloud.mstream.core.env.JobEnviroment;
import org.junit.Test;

public class env {


    @Test
    public void getFlinkEnvTest(){
        JobEnviroment jobEnviroment = FinkJobEnvironment.getInstance();
        JobEnviroment newJobEnv = jobEnviroment.getJobEnv();
        System.out.println("this is test");
    }

}
