package com.meicloud.mstream.core.test.schedule;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JobManagerScheduleFactoryBase<T> implements JobManagerScheduleFactory {

    private static final Logger LOG = LoggerFactory.getLogger(JobManagerScheduleFactoryBase.class);

    @Override
    public JobManager getJobManager(String managerType) {
        if (managerType != null) {
            switch (managerType) {
                case "flink":
                    return new FlinkJobManager();
                case "spark":
                    return new SparkJobManager();
                default:
                    return null;
            }
        } else {
            try {
                LOG.error("{} is not null", managerType);
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
