package com.wjq.cn.designpatterns.filter.web;

public class FaceFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response,
			FilterChain filterChain) {
		// TODO Auto-generated method stub
		//str.replace(":)", "^V^")
		request.setStr(request.getStr().replace(":)", "^V^")+"---FaceFilter---");
		filterChain.doFilter(request, response, filterChain);
		response.setStr(response.getStr()+"---FaceFilter---");
		
	}

}
