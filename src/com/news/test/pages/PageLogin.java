package com.news.test.pages;


import junit.framework.Assert;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

public class PageLogin {

	/**
	 * 抽取用户名输入框
	 * @return
	 */
	public UiObject getUserEditText() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.netease.newsreader.activity:id/login_username");
	}

	/**
	 * 抽取密码输入框
	 * @return
	 */
	public UiObject getPwdEditText() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.netease.newsreader.activity:id/login_password");
	}

	/**
	 * 抽取登录按钮
	 * @return
	 */
	public UiObject getLoginButton() {
		return UiObjectHelper.getUiObjectByResourceId("com.netease.newsreader.activity:id/do_login_button");
	}

	/**
	 * 输入用户名的方法
	 * @param username
	 */
	public void enterUserName(String username) {
		try {
			getUserEditText().clearTextField();
			getUserEditText().setText(username);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			Assert.fail("用户名输入框对象为null");
		}
	}

	/**
	 * 输入密码的方法
	 * @param password
	 */
	public void enterPwd(String password) {
		try {
			getPwdEditText().clearTextField();
			getPwdEditText().setText(password);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			Assert.fail("密码输入框对象为null");
		}

	}

	/**
	 * 点击登录按钮的方法
	 */
	public void clickLoginButton()  {
		try {
			getLoginButton().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			Assert.fail("登录按钮为null");
		}
	}

	/**
	 * 登录的方法
	 * @param username robotium2016@163.com
	 * @param password uiautomator
	 */
	public void login(String username, String password) {
		enterUserName(username);
		try {
			getPwdEditText().click();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		enterPwd(password);
		clickLoginButton();
	}

}
