package StaticBlock;



//java static block

import java.sql.Connection;
import java.util.Random;

public class Employe {
 private int id;
 private String name;
 private int sal;
 private static String company = "BitCode";

 private static int nextEmpId ;

 //static block is used to initialize static data members
 static {
     Random random = new Random();
     nextEmpId = Math.abs(random.nextInt());
 }

 public Employe(String name, int sal) {
     this.id = nextEmpId++;
     this.name = name;
     this.sal = sal;
 }

 public void display() {
     System.out.println(id + " " + name + " " + sal + " " + company);
 }

 public int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getSal() {
     return sal;
 }

 public void setSal(int sal) {
     this.sal = sal;
 }

 //static functions can access only static data members of class.
 //static functions can not access non-static(instance) members of class.
 //static function does not receive implicit parameter this.
 public static String getCompany() {
      return company;
 }

 public static void setCompany(String company) {
     Employe.company = company;
 }





}
