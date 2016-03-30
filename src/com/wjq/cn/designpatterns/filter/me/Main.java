package com.wjq.cn.designpatterns.filter.me;

/**
 * 
 * @author wjq
 * @ClassName : Main
 * @Version
 * @ModifiedBy
 * @Copyright asiainfo
 * @date 2016��3��22�� ����10:17:23 ��дһ�������������������滻��һЩ���е�����
 */
public class Main {
	public static void main(String[] args) {

		String message = "��Һ�:)��<script>�����У�����ҵ��������";
		System.out.println(message);
		MessageProcess msgProcessor = new MessageProcess();
		// ����Ҫ���˵���Ϣ
		msgProcessor.setMessage(message);
		// ���ù���������Ц��
		msgProcessor.setFileter(new FaceFilter());

		message = msgProcessor.doProcess();

		System.out.println(message);

		// ���ù���������html��ǩ
		msgProcessor.setFileter(new HtmlFilter());
		msgProcessor.setMessage(message);
		message = msgProcessor.doProcess();

		System.out.println(message);
		// ���ù��������������ַ�
		msgProcessor.setMessage(message);
		msgProcessor.setFileter(new SensitiveFilter());

		message = msgProcessor.doProcess();

		System.out.println(message);
		
		System.out.println("-------�ù���������ʵ��--------");
		
		
		String message2 = "��Һ�:)��<script>�����У�����ҵ��������";
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
