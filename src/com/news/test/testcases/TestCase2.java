package com.news.test.testcases;

import com.news.test.BasicTestCase;

public class TestCase2 extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp(false);
	}

	public void testTestCase2() {
		//跳转到新闻页面
		pm.getPageNavigation().goToNewsTab();
		//点击第2条新闻
		pm.getPageNews().clickNewTitle(2);
		//在新闻详情页面点击分享按钮
		pm.getPageNewsDetail().clickShareButton();
		//点击分享页面的QQ好友选项 
		pm.getPageCommon().clickByText("QQ好友");
		//在选择QQ登录方式的页面点击新用户按钮
		pm.getPageQQLoginType().clickNewUserBtn();
		//断言打开的页面表示跟预期的相符
		assertEquals("填写手机号码",pm.getPageQQRegister().getTitleText());
	}

}
