package com.wjq.cn.designpatterns.filter.web;

public class HtmlFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response,
			FilterChain filterChain) {
		// TODO Auto-generated method stub
		//str.replace("<", "[").replace(">", "]");
		request.setStr(request.getStr().replace("<", "[").replace(">", "]")+"---HtmlFilter---");
		filterChain.doFilter(request, response, filterChain);
		response.setStr(response.getStr()+"---HtmlFilter---");
	}

}
