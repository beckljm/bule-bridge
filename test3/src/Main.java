//���ű�������ϰ֮��.��ĸͼ�Ρ�ѭ�� �ַ�����
/*
�������� 
������ĸ�������һЩ������ͼ�Σ����������һ�����ӣ� 
ABCDEFG 
BABCDEF 
CBABCDE 
DCBABCD 
EDCBABC 
 
����һ��5��7�е�ͼ�Σ����ҳ����ͼ�εĹ��ɣ������һ��n��m�е�ͼ�Ρ� 
 
�����ʽ 
����һ�У�������������n��m���ֱ��ʾ��Ҫ�����ͼ�ε������������� 
�����ʽ 
���n�У�ÿ��m���ַ���Ϊ���ͼ�Ρ� 
 
�������� 
5 7 
������� 
ABCDEFG 
BABCDEF 
CBABCDE 
DCBABCD 
EDCBABC 
 
���ݹ�ģ��Լ�� 
1 <= n, m <= 26�� 
*/  
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char str;
		//char[][] pattern=new char[n][m];//��������д���
		char[][] pattern=new char[26][26];
		int i=0,j=0;
		for(i = 0;i < n;i++)  
	    {  
	        str = 'A';    
	        for(j = i;j  < m;j++)		//�˴�����ѭ���������ƴ洢�ַ���  
	        {  
	        	pattern[i][j] = str++;  
	        }    
	        str = 'A';  
	        for(j = i - 1;j >= 0;j --)  
	        {  
	        	pattern[i][j] = ++str;
	        }
	    }  
	  
	    for(i = 0;i < n;i ++)	//�˴���������ַ�����Ԫ��  
	    {  
	        for(j = 0;j < m;j ++)  
	        {  
	          System.out.print(pattern[i][j]);  
	        }  
	      System.out.println("");
	    }    
	}
}
