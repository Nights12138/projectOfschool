package com.coursemgmt.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coursemgmt.service.CourseService;
import com.coursemgmt.service.WechatpushService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class WechatpushTest {

	@Resource
	private WechatpushService wechatpushService;
	
	@Test
	public void test01(){
		System.out.println(wechatpushService.getAllWechatpushs());
	}
}
