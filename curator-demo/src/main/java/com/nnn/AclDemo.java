package com.nnn;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.data.ACL;
import org.apache.zookeeper.data.Id;
import org.apache.zookeeper.server.auth.DigestAuthenticationProvider;
import sun.security.util.DisabledAlgorithmConstraints;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class AclDemo {

    public static void main(String[] args) throws Exception {

        CuratorFramework curatorFramework = CuratorFrameworkFactory.builder().sessionTimeoutMs(5000)
                .connectString("10.6.219.105:2181")
                .retryPolicy(new ExponentialBackoffRetry(1000,3)).build();

        curatorFramework.start();
        List<ACL> aclList = new ArrayList<>();
        ACL acl = new ACL(ZooDefs.Perms.READ, new Id("digest",
                DigestAuthenticationProvider.generateDigest("admin:admin")));

        aclList.add(acl);

        curatorFramework.create().withMode(CreateMode.PERSISTENT).withACL(aclList).forPath("/auther");
;    }
}
