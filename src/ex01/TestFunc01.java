package ex01;

import java.util.Scanner;

/*
 입력
번호 이름 국어 영어 수학
num, name, kor, eng, mat
1,안유진,90,80,90
2,카리나,100,90,90
3,장원영,100,100,100
4,윈터,79,90,0

계산
tot = kor+eng+mat
avg = tot/3.0
grade

출력
번호 이름 총점 평균 등급
num, name, tot, avg, grade
*/

public class TestFunc01 {
	
	// 지역변수 : local vairable, {} 안에서 만들었고 {} 벗어나면 사라짐
	// 전역변수 : global vaiable, class에 전역변수 생성 위치(모든함수의 위)에서 만든 변수 
	// 			class 끝날때까지 존재
	// 			함수가 전역변수를 공유하기 위해 
	// 전역변수 영역
	static	int			num;
	static	String 		name;
	static	int			kor;
	static	int			eng;
	static	int			mat;
	static	int			tot;
	static	double		avg;
	static	char		grade;
	
	public static void main(String[] args) {
		// IPO : Input, Process, Output
		
		input();
		process();
		ouput();
		
	} // main end

	private static void input() {
		System.out.println("input");
		Scanner		in		=	new	Scanner(System.in);
		System.out.println("입력 : 번호, 이름, 국어, 영어, 수학");
		String		line	=	in.nextLine();					// 1,안유진,90,80,90
		String	[]	li		=	line.trim().split(",");			// 입력 받은 것의 앞뒤 공백 제거
		num					=	Integer.parseInt(li[0].trim());	//	1
		name				=	li[1].trim();					// 안유진
		kor					=	Integer.parseInt(li[2].trim());	//	90
		eng					=	Integer.parseInt(li[3].trim());	//	80
		mat					=	Integer.parseInt(li[4].trim());	//	90
		
	} // input end

	private static void process() {		
		System.out.println("process");
//								  0    1    2    3    4    5    6    7    8    9    10
		char	[]	g		=	{'F', 'F', 'F', 'F', 'F', 'F', 'D', 'C', 'B', 'A', 'A'}; 
		
		tot					=	kor	+	eng	+	mat	;
		avg					=	tot	/	3.0	;
		grade				=	g	[ (int)avg / 10 ]; // 다중 if, switch, 배열 을 이용해서 grade-
		

		
		
	} // process end

	private static void ouput() {
		System.out.println("output");
		System.out.println("번호 이름 총점 평균 등급");
		System.out.printf("%3d %s %3d %.2f %c \n",num, name, tot, avg, grade );
				
	} // output end

} // class end
