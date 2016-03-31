package com.wjq.cn.designpatterns.filter.web;

public class Main {
	public static void main(String[] args) {
		String msg = "大家好:)，<script>，敏感，被就业，没感觉，因为看不见";
		Request request=new Request();
		request.setStr(msg);
		Response response=new Response();
		response.setStr("response");
		FilterChain chain=new FilterChain();
		/*chain.addFilter(new HtmlFilter());
		chain.addFilter(new FaceFilter());
		chain.addFilter(new SensitiveFilter());*/
		chain.addFilter(new HtmlFilter()).addFilter(new FaceFilter()).addFilter(new SensitiveFilter());
		
		chain.doFilter(request, response, chain);
		System.out.println(msg);
		System.out.println(request.getStr());
		System.out.println(response.getStr());
		
	}

}
