public class ConditionalStatement {	
    public static void main(String[] args) {
    
    	float myGrowth = (float) 1.74; //����
    	int myAge = 45; //�������
    	char myGender = '�'; //���
    	char myName = '�'; //���
    	//boolean isTrue = 

    	if(myAge > 20){
    		System.out.println("��� ������� ������ 20 ��� " + myAge);
    	}

    	if(myGender == '�'){
    		System.out.println("� �������� ����");
    	}

    	if(myGender == '�'){
    		System.out.println("� �������� ����");
    	}

    	if(myGrowth < 1.80){
    		System.out.println("��� ���� " + myGrowth + " ������ 1,80");
    	} else{
    		System.out.println("��� ���� " + myGrowth + " ������ 1,80");
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