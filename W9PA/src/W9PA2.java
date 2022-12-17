import java.util.Scanner;
public class W9PA2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		// Write code below...



char ch[] = input.toCharArray();
int flag=0;

for(int i =0; i<ch.length; i++) {
	ch[i] = gui_map(ch[i]);
}

double op1 = 0.0;
double op2 = 0.0;
double oput = 0.0;
String str1 = "";
String str2 = "";

loop:
	for(int i = 0; i < ch.length; i++) {		
		if((ch[i] == '+')||(ch[i] == '-')||(ch[i] == '/')||(ch[i] == 'X')||(ch[i] == '='))	{
			for(int j =0; j <i; j++) {
				str1+=Character.toString(ch[j]);
			}
			op1 =Double.parseDouble(str1);
			for(int k = i+1; k<ch.length; k++) {
				if(ch[k] == '=') {
				flag = 1;
				op2 =Double.parseDouble(str2);
				
				if(ch[i] == '+') {
				oput = op1 + op2;	
				}else if (ch[i] == '-') {
				oput = op1 - op2;
				}else if(ch[i] == '/'){
				oput = op1 / op2;
				}else if(ch[i] == 'X') {
				oput = op1 * op2;
				}
				break loop;
				}// if
				else {
				str2+= Character.toString(ch[k]);
				}			
					
			}
		}
		
	}
if(flag == 1)
	System.out.print(oput);
}//main
	
	
	// A method that takes a character as input and returns the corresponding GUI character	
			static char gui_map(char in){
				char out = 'N';// N = Null/Empty
				char gm[][]={{'a','.'}
							,{'b','0'}
							,{'c','='}
							,{'d','+'}
							,{'e','1'}
							,{'f','2'}
							,{'g','3'}
							,{'h','-'}
							,{'i','4'}
							,{'j','5'}
							,{'k','6'}
							,{'l','X'}
							,{'m','7'}
							,{'n','8'}
							,{'o','9'}
							,{'p','/'}};
							
				// Checking for maps
				for(int i=0; i<gm.length; i++){
					if(gm[i][0]==in){
						out=gm[i][1];
						break;
					}
				}
				return out;
			}
		}




/*
import java.util.Scanner;
public class W9PA2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		// Write code below...

		String num1="",num2="";
		char op='a';
		int equal=0,flag=0,check=0,j=0,ch=0;
		char[] charArray = input.toCharArray();
		char[] numarray = new char[input.length()];
		for(int i=0; i<input.length(); i++)
		{
		  if(charArray[i]<'a' || charArray[i]>'p')
		  {
		    check=1;
		    break;
		  }
		if(charArray[i]=='c')
		    ch=1;
		  char out=gui_map(charArray[i]);
		  numarray[i]=out;
		  if(out=='+' || out=='-'|| out=='X'|| out=='/')
		  {
		    flag=1;
		    op=out;
		  }
		  if(flag==0)
		    num1=num1 + String.valueOf(out);
		  else
		  {
		    if(j==0)
		    {
		      j++;
		      continue;
		    }
		    if(out== '=')
		    {
		      equal=1;
		      break;
		    }
		    num2=num2 + String.valueOf(out);
		  }
		}
		if(ch==1 && check==0)
		{
		double a=Double.parseDouble(num1);
		  double b=Double.parseDouble(num2);
		  if(op=='+') System.out.print(a+b);
		  else if(op=='-') System.out.print(a-b);

		  else if(op=='X') System.out.print(a*b);

		  else if(op=='/') System.out.print(a/b);

		 }
		}// The main() method ends here.		

	
	// A method that takes a character as input and returns the corresponding GUI character	
		static char gui_map(char in){
			char out = 'N';// N = Null/Empty
			char gm[][]={{'a','.'}
						,{'b','0'}
						,{'c','='}
						,{'d','+'}
						,{'e','1'}
						,{'f','2'}
						,{'g','3'}
						,{'h','-'}
						,{'i','4'}
						,{'j','5'}
						,{'k','6'}
						,{'l','X'}
						,{'m','7'}
						,{'n','8'}
						,{'o','9'}
						,{'p','/'}};
						
			// Checking for maps
			for(int i=0; i<gm.length; i++){
				if(gm[i][0]==in){
					out=gm[i][1];
					break;
				}
			}
			return out;
		}
	}




Programming Assignment 2
Due on 2022-09-29, 23:59 IST
Complete the code to develop an ADVANCED CALCULATOR that emulates all the functions of the GUI Calculator as shown in the image.



Note the following points carefully:
1. Use only double datatype to store all numeric values.
2. Each button on the calculator should be operated by typing the characters from 'a' to 'p'.
3. To calculate 25-6, User should input fjhkc (where, f for 2, j for 5, h for '-', k for 6 and c for '=' ).
3. You may use the already defined function gui_map(char).
4. Without '=', operations won't give output as shown in Input_2 and Output_2 example below.
5. The calculator should be able to perform required operations on two operands as shown in the below example:

Input_1:
                   klgc

Output_1:
                        18.0
                        
                        
                  Input			Output
Test Case 1	
klgc
								18.0



*/