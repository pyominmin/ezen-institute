package com.lec.ex01_basic;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadMain {

	public static void main(String[] args) throws Exception{
		//1. read
		InputStream is = new FileInputStream("src/com/lec/ex01_basic/news.txt");//실행 시 에러나지 않아야 함//절대경로에서 상대경로로 변경(파일이 저장되어 있는 곳)
		System.out.println(is);//객체가 나온다.
		
		//System.out.println((char)is.read());//read는 1byte씩 읽는다.//이상한 값이 나온다.한글은 3byte기 때문에 깨진다.//read는 int값으로 리턴되기 때문에 a는 97이 리턴된다.
		//문자로 찍으려면 형변환 해야한다.
		//어디서부터 어디까지 읽을 것인가가 핵심이다. //끝까지 읽으려면 whil문장으로 rooping을 해야한다.
		int read_bytes = 0;
		while(true) {
			read_bytes = is.read();
			if (read_bytes == -1) break;
			System.out.println(read_bytes + " = " + (char) read_bytes);
		}
		is.close();
		
		System.out.println("-------------------------------------------------------------------------");
		//2. read(byte[], int off, int len)
		is = new FileInputStream("src/com/lec/ex01_basic/news.txt");
		
		int readByte = 0;
		byte[] readBytes = new byte[3]; //한번에 3개씩 읽어 온다.// 3byte씩 읽어온다면 한글이 깨졌다 안깨졌다 나온다.
		String data = "";
		while(true) {
			readByte = is.read( readBytes);
			if (readByte == -1) break;
			data += new String(readBytes, 0 ,readByte);//readBytes를 0부터 
		}
		System.out.println(data);
		is.close();
		
		//3. read(byte[] b)
		is = new FileInputStream("src/com/lec/ex01_basic/news.txt");
		int readByteNo;
		byte[] readBytes1 = new byte[8];
		
		readByteNo = is.read(readBytes1, 2, 3);
		for(int i = 0; i < readBytes1.length; i++) {
			System.out.println((char) readBytes1[i]);
		}
		is.close();
		
	}

}
