package com.startjava.Lesson_1;

public class ConditionalStatement {
    public static void main(String[] args) {
    
    	float myGrowth = (float) 1.74; //growth
    	int myAge = 45; //age�
    	char myGender = 'M'; //gender
    	char myName = 'A'; //name
    	//boolean isTrue = 

    	if(myAge > 20){
    		System.out.println("To my age more 20 " + myAge);
    	}

    	if(myGender == 'M'){
    		System.out.println("I male");
    	}

    	if(myGender == 'G'){
    		System.out.println("I female");
    	}

    	if(myGrowth < 1.80){
    		System.out.println("To my growth " + myGrowth + " less 1,80");
    	} else{
    		System.out.println("To my growth " + myGrowth + " more 1,80");
    	}

    	if(myName == '�'){
    		System.out.println("��� ��� ���������� �� ����� �");
    	} else if(myName == '�'){
    		System.out.println("��� ��� ���������� �� ����� �");
    	} else{
    		System.out.println("��� ��� ���������� �� ����� " + myName);
    	}
    }    
}