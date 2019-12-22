package com.meicloud.mstream.core.test.schedule;


public interface JobManagerScheduleFactory {
    JobManager getJobManager(String managerType);
}
