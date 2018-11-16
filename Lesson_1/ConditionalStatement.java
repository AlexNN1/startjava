public class ConditionalStatement {	
    public static void main(String[] args) {
    
    	float myGrowth = (float) 1.74; //Рост‚
    	int myAge = 45; //Возраст‚
    	char myGender = 'М'; //Пол»
    	char myName = 'А'; //Имя
    	//boolean isTrue = 

    	if(myAge > 20){
    		System.out.println("Мой возраст больше 20 мне " + myAge);
    	}

    	if(myGender == 'М'){
    		System.out.println("Я мужского пола");
    	}

    	if(myGender == 'Ж'){
    		System.out.println("Я женского пола");
    	}

    	if(myGrowth < 1.80){
    		System.out.println("Мой рост " + myGrowth + " меньше 1,80");
    	} else{
    		System.out.println("Мой рост " + myGrowth + " больше 1,80");
    	}

    	if(myName == 'М'){
    		System.out.println("Мое имя начинается на букву М");
    	} else if(myName == 'И'){
    		System.out.println("Мое имя начинается на букву И");
    	} else{
    		System.out.println("Мое имя начинается на букву " + myName);
    	}
    }    
}