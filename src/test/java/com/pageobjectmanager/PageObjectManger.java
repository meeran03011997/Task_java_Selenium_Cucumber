package com.pageobjectmanager;

import com.page.WikiPage;
import com.reuseabilty.Reusemethods;

public class PageObjectManger extends Reusemethods{
	private WikiPage wikiPage ;

	public WikiPage getWikiPage() {
		return (wikiPage==null)? wikiPage = new WikiPage():wikiPage;
		
	}
	
	

}
