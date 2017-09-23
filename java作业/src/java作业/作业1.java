package java作业;

import java.util.*;

public class 作业1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("输入一个整数: ");  
		n=s.nextInt();
		doubleNum(n);
    }
     
    public static void doubleNum(int n){
        System.out.println(n);
        if (n <= 5000) {
            doubleNum(n * 2);
            System.out.println(n);
        }
    }
}


