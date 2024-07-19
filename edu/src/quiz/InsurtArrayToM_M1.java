package quiz;

import java.io.FileWriter;
import java.io.IOException;

public class InsurtArrayToM_M1 {

	public static void main (String[] args) throws IOException {
		//파일을 생성하기 위해 FileWriter 클래스 사용해 fw 객체를 생성
				FileWriter fw = new FileWriter("C:/workspace_java/edu/m.txt");
				FileWriter fw1 = new FileWriter("m1.txt");
			 //파일에 넣고 싶은 내용 작성 : .write(내용);
				int k = 1;
				for(int i=0; i<3; i++) {
					for(int j = 0; j < 4; j++ ) {
						fw.write(k+"\t");
						k++;
						
					}
					fw.write("\n");
				}
				fw.close(); // 꼭 사용 후 닫아주기.
				k=1;
				for(int i=0; i<4; i++) {
					for(int j = 0; j <3; j++) { 
						fw1.write(k+"\t");	
						k++;
					}
					fw1.write("\n");
				}
				fw1.close();
			}

	}


