package com.wjq.cn.designpatterns.filter.me;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	
	private List<Filter> filters=new ArrayList();
	
	public void add(Filter filter){
		filters.add(filter);
	}

	public String doFilter(String str){
		if(null!=filters && filters.size()>0){
			for (int i = 0; i < filters.size(); i++) {
				str=filters.get(i).doFilter(str);
			}
		}
		return str;
	}
	

}
