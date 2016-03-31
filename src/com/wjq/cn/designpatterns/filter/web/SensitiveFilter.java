package com.wjq.cn.designpatterns.filter.web;

public class SensitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response,
			FilterChain filterChain) {
		// TODO Auto-generated method stub
		//replace("敏感", "").replace("被就业", "就业")
		request.setStr(request.getStr().replace("敏感", "").replace("被就业", "就业")+"---SensitiveFilter---");
		filterChain.doFilter(request, response, filterChain);
		response.setStr(response.getStr()+"---SensitiveFilter---");
	}

}
