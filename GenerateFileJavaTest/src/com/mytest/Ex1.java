package com.mytest;

import java.io.FileWriter;
import java.util.Date;

public class Ex1 {

	public static void main(String[] args) {
		
		
		  try{    
	           FileWriter fw=new FileWriter("e:\\temp\\file1.txt",true);    
	           fw.write("Welcome to Jenkins World!, Time:"+new Date());    
	           fw.write("\n");
	           
	           fw.close();    
	           
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     }    

	
}