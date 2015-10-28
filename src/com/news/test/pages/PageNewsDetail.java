package com.news.test.pages;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

public class PageNewsDetail {

	/**
	 * 获取右上角更多的控件
	 * 
	 * @return
	 */
	public UiObject getMoreTextView() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.netease.newsreader.activity:id/biz_newspage_menu_more");
	}

	/**
	 * 点击更多的方法
	 */
	public void clickMoreTextView() {
		try {
			getMoreTextView().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 获取收藏控件
	 * 
	 * @return
	 */
	public UiObject getFavoritesTextView() {
		return UiObjectHelper.getUiObjectByText("收藏");
	}

	/**
	 * 点击收藏的方法
	 */
	public void clickFavoritesTextView() {
		try {
			getFavoritesTextView().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 获取分享按钮
	 */
	public UiObject getShareButton() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.netease.newsreader.activity:id/comment_reply_share");
	}
	
	/**
	 * 点击分享按钮
	 */
	public void clickShareButton(){
		try {
			getShareButton().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
