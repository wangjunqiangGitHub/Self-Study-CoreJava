package com.wjq.cn.designpatterns.filter.me;

public class MessageProcess {
	
	private String message;
	
	//单个过滤器
	private Filter fileter;
	//过滤器链
	private FilterChain filterChain;
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Filter getFileter() {
		return fileter;
	}

	public void setFileter(Filter fileter) {
		this.fileter = fileter;
	}
	
	public FilterChain getFilterChain() {
		return filterChain;
	}

	public void setFilterChain(FilterChain filterChain) {
		this.filterChain = filterChain;
	}

	public String doProcess(){
		return fileter.doFilter(message);
	}

	public String doProcessChain(){
		return filterChain.doFilter(message);
	}
	
}
