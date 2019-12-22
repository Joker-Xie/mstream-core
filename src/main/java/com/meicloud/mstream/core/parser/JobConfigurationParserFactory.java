package com.meicloud.mstream.core.parser;

import java.util.Properties;

public interface JobConfigurationParserFactory {
    JobConfiguration parser(Properties conf);
}
