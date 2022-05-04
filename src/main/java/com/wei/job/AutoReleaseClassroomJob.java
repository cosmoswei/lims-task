package com.wei.job;

import org.apache.shardingsphere.elasticjob.api.ShardingContext;
import org.apache.shardingsphere.elasticjob.simple.job.SimpleJob;
import org.springframework.stereotype.Component;

@Component
public class AutoReleaseClassroomJob implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {

    }
}
