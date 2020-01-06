package com.nnn;

import com.sun.org.apache.xpath.internal.operations.String;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.data.Stat;

public class CuratorDemo {

    public static void main(String[] args) throws Exception {

        CuratorFramework curatorFramework = CuratorFrameworkFactory.builder().connectString("10.6.219.105:2181")
                .sessionTimeoutMs(5000).retryPolicy(new ExponentialBackoffRetry(1000,3)).build();

        curatorFramework.start();

        //createData(curatorFramework);
        //updateData(curatorFramework);
        deleteData(curatorFramework);
    }

    private static void createData(CuratorFramework curatorFramework) throws Exception {
        curatorFramework.create().creatingParentContainersIfNeeded().withMode(CreateMode.PERSISTENT)
                .forPath("/data/test", "aniuniu".getBytes());
    }

    private static void updateData(CuratorFramework curatorFramework) throws Exception {
        curatorFramework.setData().forPath("/data/test", "wangning".getBytes());
    }

    private static void deleteData(CuratorFramework curatorFramework) throws Exception {
        Stat stat = new Stat();
        byte[] values = curatorFramework.getData().storingStatIn(stat).forPath("/data/test");

        curatorFramework.delete().withVersion(stat.getVersion()).forPath("/data/test");
    }
}
