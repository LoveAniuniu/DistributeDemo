package com.nnn.reposervicedemo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RepoController {

    @PutMapping("repo/{pid}")
    public void getRepoId(@PathVariable("pid") String pid) {

        System.out.println("扣减商品库存："+pid);
    }
}
