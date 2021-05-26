/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studobjectarray;

import java.util.Scanner;

/**
 *
 * @author Megha Patel
 */
public class StudObjectArray {

   
    public static void main(String[] args) {
        Student[] studList=new Student[5];
        Scanner input=new Scanner(System.in);
        
        for(int i=0;i<studList.length;i++)
        {
            studList[i]=new Student();
            System.out.println("Enter Student name: ");
            studList[i].setName(input.nextLine());
        }
        
        for(int i=0;i<studList.length;i++)
        {
            System.out.println("Student name is "+ studList[i].getName());
        }
    }

}
