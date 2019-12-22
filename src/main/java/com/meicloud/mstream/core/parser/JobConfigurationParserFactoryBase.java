package com.meicloud.mstream.core.parser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class JobConfigurationParserFactoryBase implements JobConfigurationParserFactory {

    private static final Logger LOG = LoggerFactory.getLogger(JobConfigurationParserFactoryBase.class);

    @Override
    public JobConfiguration parser(Properties conf) {
        if (conf != null) {
            String parserType = conf.get("xxx").toString();
            switch (parserType) {
                case "DDL":
                    break;
                case "DML":
                    break;
                case "SET":
                    break;
                default:
                    break;
            }
        } else {
            LOG.error("{} is no null", conf);
        }
        return null;
    }
}
