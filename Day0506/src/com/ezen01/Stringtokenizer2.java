package com.ezen01;
import java.util.*;
public class Stringtokenizer2 {

	public static void main(String[] args) {
String source = " 100, 200, 300, 400";
StringTokenizer st = new StringTokenizer(source,",");

while(st.hasMoreTokens()) {
	System.out.println(st.nextToken());
}
	}

}
