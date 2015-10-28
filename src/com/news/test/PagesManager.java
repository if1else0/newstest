package com.news.test;

import com.news.test.pages.PageCommon;
import com.news.test.pages.PageLogin;
import com.news.test.pages.PageMy;
import com.news.test.pages.PageMyFavorites;
import com.news.test.pages.PageNavigation;
import com.news.test.pages.PageNews;
import com.news.test.pages.PageNewsDetail;
import com.news.test.pages.PageQQLoginType;
import com.news.test.pages.PageQQRegister;
import com.news.test.pages.PageSettings;

public class PagesManager {
	PageNavigation pageNavigation;
	PageLogin pageLogin;
	PageNews pageNews;
	PageNewsDetail pageNewsDetail;
	PageMy pageMy;
	PageMyFavorites pageMyFavorites;
	PageSettings pageSettings;
	PageCommon pageCommon;
	PageQQLoginType pageQQLoginType;
	PageQQRegister pageQQRegister;
	
	public PageNavigation getPageNavigation(){
		if(pageNavigation == null){
			pageNavigation = new PageNavigation();
		}
		return pageNavigation;
	}
	
	public PageLogin getPageLogin(){
		if(pageLogin == null){
			pageLogin = new PageLogin();
		}
		return pageLogin;
	}
	
	public PageNews getPageNews(){
		if(pageNews == null){
			pageNews = new PageNews();
		}
		return pageNews;
	}
	
	public PageNewsDetail getPageNewsDetail(){
		if(pageNewsDetail == null){
			pageNewsDetail = new PageNewsDetail();
		}
		return pageNewsDetail;
	}

	public PageMy getPageMy(){
		if(pageMy == null){
			pageMy = new PageMy();
		}
		return pageMy;
	}
	
	public PageMyFavorites getPageMyFavorites(){
		if(pageMyFavorites == null){
			pageMyFavorites = new PageMyFavorites();
		}
		return pageMyFavorites;
	}
	
	public PageSettings getPageSettings(){
		if(pageSettings == null){
			pageSettings = new PageSettings();
		}
		return pageSettings;
	}
	
	public PageCommon getPageCommon(){
		if(pageCommon == null){
			pageCommon = new PageCommon();
		}
		return pageCommon;
	}
	
	public PageQQLoginType getPageQQLoginType(){
		if(pageQQLoginType  == null){
			pageQQLoginType = new PageQQLoginType();
		}
		return pageQQLoginType;
	}
	
	public PageQQRegister getPageQQRegister(){
		if(pageQQRegister == null){
			pageQQRegister = new PageQQRegister();
		}
		return pageQQRegister;
	}
	
}
