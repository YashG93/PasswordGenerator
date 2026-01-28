package org.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PasswordGen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String upper="ABCDEFGHIJKLMNOPRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String number="123456789";
        String characters="!@#45^&*()_+=-";

        String Allchar=upper+lower+number+characters;
        System.out.println("Enter password length" );
        int length=sc.nextInt();

        if(length<4){
            System.out.println("Password should be greater than 4 letters ");
            return;
        }
        Random random=new Random();
        StringBuilder password=new StringBuilder();

        password.append(upper.charAt(random.nextInt(upper.length())));
        password.append(lower.charAt(random.nextInt(lower.length())));
        password.append(number.charAt(random.nextInt(number.length())));
        password.append(characters.charAt(random.nextInt(characters.length())));

        for(int i=4; i<length;i++){
            password.append(characters.charAt(random.nextInt(characters.length())));
        }

        char[] pwdArray=password.toString().toCharArray();
        for(int i=0;i<pwdArray.length;i++){
            int j=random.nextInt(pwdArray.length);
            char temp=pwdArray[i];
            pwdArray[i]=pwdArray[j];
            pwdArray[j]=temp;
        }
        System.out.println("Generated password:"+new String(pwdArray));
        sc.close();
    }
}