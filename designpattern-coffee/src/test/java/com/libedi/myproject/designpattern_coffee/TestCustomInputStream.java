package com.libedi.myproject.designpattern_coffee;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.libedi.myproject.designpattern_coffee.customio.LowerCaseInputStream;

public class TestCustomInputStream {
	@Test
	public void testLowerCaseInputStream() throws Exception{
		int c;
		try{
			InputStream in = new LowerCaseInputStream(
					new BufferedInputStream(
							new FileInputStream("C:/Kakao/workspace/designpattern-coffee/src/test/java/com/libedi/myproject/designpattern_coffee/test.txt")));
			while((c = in.read()) >= 0){
				System.out.print((char) c);
			}
			in.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
