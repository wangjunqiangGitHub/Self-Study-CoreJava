package com.wjq.cn.designpatterns.filter.web;

public class SensitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response,
			FilterChain filterChain) {
		// TODO Auto-generated method stub
		//replace("����", "").replace("����ҵ", "��ҵ")
		request.setStr(request.getStr().replace("����", "").replace("����ҵ", "��ҵ")+"---SensitiveFilter---");
		filterChain.doFilter(request, response, filterChain);
		response.setStr(response.getStr()+"---SensitiveFilter---");
	}

}
