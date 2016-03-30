package com.wjq.cn.designpatterns.filter.me;

/**
 * 
 * @author wjq
 * @ClassName : Main
 * @Version
 * @ModifiedBy
 * @Copyright asiainfo
 * @date 2016年3月22日 上午10:17:23 编写一个过滤器链，用来过替换掉一些敏感的内容
 */
public class Main {
	public static void main(String[] args) {

		String message = "大家好:)，<script>，敏感，被就业，哈哈哈";
		System.out.println(message);
		MessageProcess msgProcessor = new MessageProcess();
		// 设置要过滤的信息
		msgProcessor.setMessage(message);
		// 设置过滤器过滤笑脸
		msgProcessor.setFileter(new FaceFilter());

		message = msgProcessor.doProcess();

		System.out.println(message);

		// 设置过滤器过滤html标签
		msgProcessor.setFileter(new HtmlFilter());
		msgProcessor.setMessage(message);
		message = msgProcessor.doProcess();

		System.out.println(message);
		// 设置过滤器过滤敏感字符
		msgProcessor.setMessage(message);
		msgProcessor.setFileter(new SensitiveFilter());

		message = msgProcessor.doProcess();

		System.out.println(message);
		
		System.out.println("-------用过滤器链来实现--------");
		
		
		String message2 = "大家好:)，<script>，敏感，被就业，哈哈哈";
		FilterChain filterChain=new FilterChain();
		filterChain.add(new FaceFilter());
		filterChain.add(new HtmlFilter());
		filterChain.add(new SensitiveFilter());
		msgProcessor.setFilterChain(filterChain);
		msgProcessor.setMessage(message2);
		message2=msgProcessor.doProcessChain();
		System.out.println(message2);

	}

}
