package util;

public class InputValidator {
   
   public static boolean isValidEmail(String email) {
	   return email != null && email.matches("^[\\\\w.-]+@[a-zA-Z\\\\d.-]+\\\\.[a-zA-Z]{2,6}$");
   }
   
   public static boolean isValidName(String name) {
	   return name != null && name.matches("^[A-Za-z]$");
   }
   
   public static boolean isValidPhone(String number) {
	   return number != null || number.matches("^[0-9]{10,12}$");
	   
   }
   
   public static boolean isValidZip(String zipCode) {
	   return zipCode != null || zipCode.matches("^[0-9]{5}$");
	   
   }
   
   
}
