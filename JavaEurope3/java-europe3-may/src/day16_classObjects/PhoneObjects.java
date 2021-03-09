package day16_classObjects;

public class PhoneObjects {

	public static void main(String[] args) {

        CellPhone phone1 = new CellPhone();
        
        
        phone1.message(776154940);
        phone1.call();
        phone1.takeAphoto();
        
        phone1.brand = "Samsung A19";
        phone1.color = "Grey";
        phone1.price = 10000;
        phone1.screenSize = 2.0;
        
        phone1.message(776154940);
        phone1.call();
        phone1.takeAphoto();
        
        System.out.println(phone1.brand);
        System.out.println(phone1.color);
        System.out.println(phone1.price);
        System.out.println(phone1.screenSize);
        
        phone1.color="Red";
        System.out.println(phone1.color);
        
        phone1.call();
        
        CellPhone phone2 = new CellPhone();
        
        phone2.brand = "Siemens";
        phone2.screenSize = 1.5;
        phone2.price = 39.22;
        
        System.out.println("Phone2 values ");
        System.out.println("Brand: " + phone2.brand);
        System.out.println("Color: " + phone2.color);
        System.out.println("Price: " + phone1.price);
        System.out.println("Screen size: " + phone1.screenSize);
        

	}

}
