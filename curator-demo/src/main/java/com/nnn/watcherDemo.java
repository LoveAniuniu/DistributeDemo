package com.nnn;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.cache.NodeCache;
import org.apache.curator.framework.recipes.cache.NodeCacheListener;
import org.apache.curator.retry.ExponentialBackoffRetry;

import java.util.Arrays;

public class watcherDemo {

    public static void main(String[] args) throws Exception {
        //pathchildCache
        //nodeCache
        //TreeCache

        CuratorFramework curatorFramework = CuratorFrameworkFactory.builder().sessionTimeoutMs(5000).connectString("10.6.219.105:2181")
                .retryPolicy(new ExponentialBackoffRetry(1000, 3)).build();

        curatorFramework.start();
        addListenerWithNode(curatorFramework);
        System.in.read();
    }

    private static void addListenerWithNode(CuratorFramework curatorFramework) throws Exception {
        final NodeCache nodeCache = new NodeCache(curatorFramework,"/watcher");
        NodeCacheListener nodeCacheListener = new NodeCacheListener() {
            @Override
            public void nodeChanged() throws Exception {
                System.out.println("********begin******");
                System.out.println(nodeCache.getCurrentData().getPath()+"-----"+Arrays.toString(nodeCache.getCurrentData().getData()));
            }
        };

        nodeCache.getListenable().addListener(nodeCacheListener);
        nodeCache.start();
    }
}
