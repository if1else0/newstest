package com.news.test.testcases;

import com.news.test.BasicTestCase;


/**
 *	测试用例详情：
 * 		点击“我”tab页
 * 		点击登录头像
 * 		输入用户名：robotium2016@163.com
 * 		输入密码：uiautomator
 *      点击登录按钮
 *      点击回到“新闻”tab页
 *      点击进入第二条新闻
 *      继续点击进入第一条新闻详情
 *      点击收藏按钮
 *      点击返回按钮
 *      继续点击返回按钮
 *      点击“我”tab页
 *      点击收藏按钮
 *      在我的收藏页校验第一条的标题内容和新闻详情页面的标题一致
 *      
 *      
 *      
 * 
 * @author aaronyang
 *
 */
public class TestCase1 extends BasicTestCase{

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		//需要在登录下进行，所有设置为true
		super.setUp(true);
	}
	
	public void testTestCase1(){
		//登录后需跳转到新闻页面
		pm.getPageNavigation().goToNewsTab();
		//获取需要点击那一行到新闻标题
		String expect = pm.getPageNews().getNewsTitleText(2);
		//点击指定到新闻行
		pm.getPageNews().clickNewTitle(2);
		//在新闻详情页点击右上角的更多按钮
		pm.getPageNewsDetail().clickMoreTextView();
		//点击收藏
		pm.getPageNewsDetail().clickFavoritesTextView();
		//可以通过getUiDevice()执行一些模拟硬件的操作，如这里的返回
		getUiDevice().pressBack();
		//需要跳转会我的tab页
		pm.getPageNavigation().goToMySettingsTab();
		//在我tab页点击收藏
		pm.getPageMy().clickFavoirtesRL();
		//在收藏页面获取第一行的新闻标题
		String actual = pm.getPageMyFavorites().getTitleTVText(0);
		//跟预期的做比较，断言两者相等
		assertEquals("收藏的新闻标题不一致",expect,actual);
		//模拟硬件返回
		getUiDevice().pressBack();
		//返回新闻首页
		pm.getPageNavigation().goToNewsTab();
	}
	

}
