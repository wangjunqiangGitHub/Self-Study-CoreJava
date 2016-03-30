package com.wjq.cn.exception.eg1;

public class TestStudent {
	
	public static void main(String[] args) {
		Student student=new Student();
		try {
			student.regist(-10);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	

}
class Student{
	private int idcard;
	
	
	public void regist(int idcard) throws MyException{
		if(idcard>0){
			this.idcard=idcard;
		}else {
			throw new MyException("—ß∫≈”–ŒÛ");
		}
	}


	@Override
	public String toString() {
		return "Student [idcard=" + idcard + "]";
	}
	
	
	
}




