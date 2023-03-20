package JavaIO;

import jdk.jshell.execution.Util;

import java.io.File;
import java.io.IOException;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		
       FileUtil.createDir("C:/Users/DELL 5430/Desktop/javaeclipse-workspaces/","Java",1);
        File file1= new File("C:/Users/DELL 5430/Desktop/javaeclipse-workspaces/Java");
       printFileInfo(file1);
       FileUtil.createFile("C:/Users/DELL 5430/Desktop/javaeclipse-workspaces/Java/","demo.zip",1);
        File file2= new File("C:/Users/DELL 5430/Desktop/javaeclipse-workspaces/Java/demo.zip");
        printFileInfo(file2);
        FileUtil.createFile("C:/Users/DELL 5430/Desktop/javaeclipse-workspaces/Java/","Bitcode.jpag",1);
        File file3= new File("C:/Users/DELL 5430/Desktop/javaeclipse-workspaces/Java/Bitcode.jpag");
        printFileInfo(file3);
        FileUtil.createDir("C:/Users/DELL 5430/Desktop/javaeclipse-workspaces/Java/","Demo",1);
        File file4= new File("C:/Users/DELL 5430/Desktop/javaeclipse-workspaces/Java/Demo");
        printFileInfo(file4);
        FileUtil.createFile("C:/Users/DELL 5430/Desktop/javaeclipse-workspaces/Java/Demo/","class1.java",1);
       File file5= new File("C:/Users/DELL 5430/Desktop/javaeclipse-workspaces/Java/Demo/class1.java");
        printFileInfo(file5);
        FileUtil.createFile("C:/Users/DELL 5430/Desktop/javaeclipse-workspaces/Java/Demo/","demo.cpp",1);
        File file6= new File("C:/Users/DELL 5430/Desktop/javaeclipse-workspaces/Java/Demo/demo.cpp");
        printFileInfo(file6);
        FileUtil.createDir("C:/Users/DELL 5430/Desktop/javaeclipse-workspaces/Java/Demo/","2023",1);
        File file7= new File("C:/Users/DELL 5430/Desktop/javaeclipse-workspaces/Java/Demo/2023");
        printFileInfo(file7);
        String paths="C:/Users/DELL 5430/Desktop/javaeclipse-workspaces/";
        create(paths,2);
	}
	public static void create(String path, int noOfDir) {
		 if (noOfDir == 0)
	            return;
	 
	        noOfDir -= 1;
		for(int i=0; i<=noOfDir;i++) {
			
			
			if(i==1) {
		FileUtil.createDir(path,"java2/",1);
		}
			else {	FileUtil.createDir(path,"java3/",1);
			}
			}

		
		create(path,noOfDir);
	}	
	
	
	
	public static void printFileInfo(File file) {
			 
			   System.out.println("Abs Path: " + file.getAbsolutePath());
		        System.out.println("Exists: " + file.exists());
		        System.out.println("isFile: " + file.isFile()  + " isDir: " + file.isDirectory());
		        System.out.println("Size: " + file.length());
		        System.out.println("Last modified on: " + file.lastModified());
		        System.out.println("RWE: " + file.canRead() + " " + file.canWrite() + " " + file.canExecute());
		        System.out.println("-------------------------------------------------");
		   
		}
		
	}
	
