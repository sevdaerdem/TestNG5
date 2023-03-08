package gun01;

import org.testng.annotations.Test;

public class Giriş {


    @Test (priority = 1)

    public void WebSitesiniac(){
        System.out.println("driver tanımlandı web sitesi açıldı");

   }
   @Test (priority = 2)

    public void Loginişlemiyap(){
       System.out.println("Login test yapıldı");

   }
        @Test (priority = 3)
        public void DriverKapat(){
        System.out.println("driveri kapat");
    }
}


