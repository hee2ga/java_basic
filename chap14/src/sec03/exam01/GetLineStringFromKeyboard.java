package sec03.exam01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyboard {
	public static void main(String[] args) throws Exception {
		// InputStream를 Reader로 변환 후 BufferdReader를 연결
		InputStream is=System.in;
		Reader reader=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(reader);
		
		while(true) {
			System.out.print("입력하세요 : ");
			String lineStr=br.readLine();
			if(lineStr.equals("q")||lineStr.equals("quit"))break;
			System.out.print("입력된 내용 : "+lineStr);
			System.out.println();
		}
		br.close();
	}

}
