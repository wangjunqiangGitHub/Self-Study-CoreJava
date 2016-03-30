package com.wjq.cn.transient_volatile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestTransient implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7951038036513069061L;

	private String userName;
	private transient String password;

	public TestTransient(String userName) {
		super();
		this.userName = userName;
	}

	public TestTransient(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "TestTransient [userName=" + userName + ", password=" + password
				+ "]";
	}

	public static void main(String[] args) throws FileNotFoundException {
		try {
			String path=TestTransient.class.getResource("").getPath();
			System.out.println(path);
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("transient.txt"));
			
			TestTransient testTransient=new TestTransient("root", "root");
			System.out.println(testTransient);
			out.writeObject(testTransient);
			out.close();
			
			try {
				ObjectInputStream in=new ObjectInputStream(new FileInputStream("transient.txt"));
				TestTransient transient1=(TestTransient) in.readObject();
				System.out.println(transient1);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
