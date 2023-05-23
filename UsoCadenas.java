package cadenas;

public class UsoCadenas {
    public UsoCadenas() {
        super();
    }

    public static void main(String[] args) {
        UsoCadenas usoCadenas = new UsoCadenas();
        int longitud;
        String mail1="";
        String mail2="marcelaagueroiesmb@gmail.com";
        if (mail1.equals(mail2)){
         System.out.println("Los mails son iguales");   
        }
        else {
         System.out.println("Los mails son distintos");
        }
        longitud=mail1.length();
        System.out.println("La longitud del mail 1 es: "+longitud);
        
      
       
    }
}
