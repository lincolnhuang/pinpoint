package com.nhn.pinpoint.profiler.modifier.redis.filter;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

public class RedisClusterPipelineMethodNamesTest {

    @Test
    public void test() {
        Set<String> names = RedisClusterPipelineMethodNames.get();

        assertTrue(names.contains("get"));
        assertTrue(names.contains("sinterstore"));
        assertTrue(names.contains("info"));
        assertTrue(names.contains("sync"));
        assertTrue(names.contains("syncAndReturnAll"));
        assertTrue(names.contains("close"));
    }

}
