package com.news.test;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class BasicTestCase extends UiAutomatorTestCase{
	protected PagesManager pm = null;
	/**
	 * 通过aapt dump badging apkname获得这两个信息
	 */
	String packageName = "com.netease.newsreader.activity";
	String activityName = "com.netease.nr.biz.ad.AdActivity";
	

	protected void setUp(boolean isNeedLogin) throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		/**
		 * 通过am start命令启动被测试应用，这样可以确保在不同的手机或者OS上用统一的代码启动测试应用
		 */
		Runtime.getRuntime().exec(
				"am start -n " + packageName + "/" + activityName);
		pm = new PagesManager();
        Thread.sleep(1000);
		if(isNeedLogin){
			pm.getPageNavigation().goToMySettingsTab();
			pm.getPageMy().clickLoginImageView();
			pm.getPageLogin().login("robotium2016@163.com", "uiautomator");
		}
	}
	
	
	

}
