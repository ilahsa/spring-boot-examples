package com.neo.web;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.neo.Application;
import com.neo.util.NeoProperties;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ProPertiesTest {

	
	@Autowired
    private NeoProperties neoProperties;


    @Test
    public void getHello() throws Exception {
    	System.out.println(neoProperties.getTitle());
        Assert.assertEquals(neoProperties.getTitle(), "纯洁的微笑");
        Assert.assertEquals(neoProperties.getDescription(), "分享生活和技术");
    }

    
    @Test
    public void testMap() throws Exception {
    	Map<String, Long> orderMinTime=new HashMap<String, Long>();
    	orderMinTime.get("123");
    }

}