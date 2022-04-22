package ex;
import java.util.Arrays;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.NoSuchElementException;


public class ex01 {

	public static void main(String[] args) throws IOException{ //데이터 배열을 만들기 위해 숫자구함
		int count=0;
{
	File file = new File("data/suwonpetdata.txt");
	FileInputStream infile = new FileInputStream(file);
	Scanner sc = new Scanner(infile);
	
	while(sc.hasNextLine()) {
		sc.nextLine();
		count++;
		
	}
	System.out.println("count : " + count);//맨위 시도명 이배열은 순수 데이터가 아니기 떄문에 뺴줌
	sc.close();
	infile.close();
}
String[] region = new String[count];
String[] city = new String[count];
String[] district = new String[count];
String[] dong = new String[count];
int[] variety = new int[count];
String[] howmany = new String[count];
String[] owner = new String[count];
String[] office = new String[count];
String[] callnum = new String[count];
String[] date = new String[count];
	{
	File file = new File("data/suwonpetdata.txt");
	FileInputStream infile = new FileInputStream(file);
	Scanner sc = new Scanner(infile);
	int total = 0;
	sc.nextLine();  // 첫번째 줄 읽어서 버린다
	for(int i = 0; i<count; i++) {
		String line = sc.nextLine();
		
		String[]tokens=line.split(",");
		region[i] = tokens[0];
		city[i] = tokens[1];
		district[i] = tokens[2];
		dong[i] = tokens[3];
		variety[i]=Integer.parseInt(tokens[4]);
		total +=variety[i];
		
		System.out.println(Arrays.toString(tokens));
	}
		for(int i=0; i<count; i++)
			System.out.printf("%s %s %s %s %d\n" , region[i],city[i],district[i],dong[i],variety[i]);
			System.out.println("total " + total);
	}
}
}
