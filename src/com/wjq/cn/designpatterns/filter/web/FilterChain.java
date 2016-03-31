package com.wjq.cn.designpatterns.filter.web;

import java.util.ArrayList;

public class FilterChain implements Filter {
	
	private ArrayList<Filter> filters=new ArrayList<>();
	
	private int index;
	
	public FilterChain() {
		// TODO Auto-generated constructor stub
	}
	
	public FilterChain addFilter(Filter filter){
		filters.add(filter);
		return this;
	}

	@Override
	public void doFilter(Request request, Response response,
			FilterChain filterChain) {
		
		/*if(null!=filters && filters.size()>0 && index<filters.size()){
			
		}*/
		
		if(index==filters.size()) return;//停止调用下一个filter
		
		Filter filter=filters.get(index++);
		filter.doFilter(request, response, filterChain);
	}

}
