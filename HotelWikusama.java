import java.util.Scanner;

public class HotelWikusama {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);

        System.out.println("1.Duku" + "\n harga Permalam: \n weekday: 915.000 \n weekend: 1.025.000 \n holiday: 1.225.000");
        System.out.println("\n2.Jeruk" + "\n harga permalam: \n weekday: 915.000 \n weekend: 1.025.000 \n holiday: 1.225.000");
        System.out.println("\n3.Alpukat" + "\n harga permalam: \n weekday: 575.000 \n weekend: 695.000 \n holiday: 895.000");
        System.out.println("\n4.Jambu Air" + "\n harga permalam: \n weekday: 575.000 \n weekend: 695.000 \n holiday: 895.000");
        System.out.println("\n5.Durian" + "\n harga permalam: \n weekday: 595.000 \n weekend: 715.000 \n holiday: 915.000");
        System.out.println("\n6.Melon" + "\n harga permalam: \n weekday: 595.000 \n weekend: 715.000 \n holiday: 915.000");
        System.out.println("\n7.Belimbing" + "\n harga permalam: \n weekday: 495.000 \n weekend: 575.000 \n holiday: 755.000");
        System.out.println("\n8.mangga" + "\n harga permalam: \n weekday: 495.000 \n weekend: 575.000 \n holiday: 755.000");
        System.out.println("\n9.kedondong" + "\n harga permalam: \n weekday: 495.000 \n weekend: 575.000 \n holiday: 755.000");
        
        System.out.println("\n\npilih Cottage Yang Akan Di pesan: ");
        int kamar = x.nextInt();
        
        

        int weekday, weekend, holiday
        
        if(kamar == 1){
        System.out.println("1. weekday");    
        System.out.println("2. weekend");    
        System.out.println("3. holiday");
        System.out.println("menginap di hari apa:");
        int hari = x.nextInt();
             if(hari == 1){
                System.out.println("Harga permalam: Rp.915.000");
                    weekday = x.nextInt();}
                    
                else if(hari == 2){
                    System.out.println("Harga permalam: Rp.1.025.000");
                        weekend = x.nextInt();}

                    else{
                        System.out.println("Harga permalam: Rp.1.225.000");
                            holiday = x.nextInt();}}

        else if(kamar == 2){ 
        System.out.println("1. weekday");    
        System.out.println("2. weekend");    
        System.out.println("3. holiday");
        System.out.println("menginap di hari apa:");
        int hari = x.nextInt();
             if(hari == 1){
                System.out.println("Harga permalam: Rp.915.000");
                    weekday = x.nextInt();}

                else if(hari == 2){
                    System.out.println("Harga permalam: Rp.1.025.000");
                         weekend = x.nextInt();}

                    else{
                        System.out.println("Harga permalam: Rp.1.225.000");
                            holiday = x.nextInt();}}

        else if(kamar == 3){
        System.out.println("1. weekday");    
        System.out.println("2. weekend");    
        System.out.println("3. holiday");
        System.out.println("menginap di hari apa:");
        int hari = x.nextInt();
             if(hari == 1){
                System.out.println("Harga permalam:  Rp.575.000");
                    weekday = x.nextInt();}

                else if(hari == 2){
                    System.out.println("Harga permalam: Rp.695.000");
                        weekend = x.nextInt();}

                    else{
                        System.out.println("Harga permalam: Rp.859.000");
                             holiday = x.nextInt();}}

        else if(kamar == 4){
        System.out.println("1. weekday");    
        System.out.println("2. weekend");    
        System.out.println("3. holiday");
        System.out.println("menginap di hari apa:");
        int hari = x.nextInt();
             if(hari == 1){
                System.out.println("Harga permalam:  Rp.575.000");
                    weekday = x.nextInt();}

                else if(hari == 2){
                    System.out.println("Harga permalam: Rp.695.000");
                        weekend = x.nextInt();}

                    else{
                        System.out.println("Harga permalam: Rp.859.000");
                            holiday = x.nextInt();}}

        else if(kamar == 5){
        System.out.println("1. weekday");    
        System.out.println("2. weekend");    
        System.out.println("3. holiday");
        System.out.println("menginap di hari apa:");
        int hari = x.nextInt();
             if(hari == 1){
                System.out.println("Harga permalam:  Rp. 595.000");
                    weekday = x.nextInt();}

                else if(hari == 2){
                    System.out.println("Harga permalam: Rp.715.000");
                        weekend = x.nextInt();}

                    else{
                        System.out.println("Harga permalam: Rp. 915.000");
                            holiday = x.nextInt();}}

        else if(kamar == 6){
        System.out.println("1. weekday");    
        System.out.println("2. weekend");    
        System.out.println("3. holiday");
        System.out.println("menginap di hari apa:");
        int hari = x.nextInt();
             if(hari == 1){
                System.out.println("Harga permalam:  Rp. 595.000");
                    weekday = x.nextInt();}

                else if(hari == 2){
                    System.out.println("Harga permalam: Rp.715.000");
                        weekend = x.nextInt();}

                    else{
                        System.out.println("Harga permalam: Rp. 915.000");
                            holiday = x.nextInt();}}

        else if(kamar == 7){
        System.out.println("1. weekday");    
        System.out.println("2. weekend");    
        System.out.println("3. holiday");
        System.out.println("menginap di hari apa:");
        int hari = x.nextInt();
             if(hari == 1){
                System.out.println("Harga permalam:  Rp. 595.000");
                    weekday = x.nextInt();}

                else if(hari == 2){
                    System.out.println("Harga permalam: Rp.715.000");
                        weekend = x.nextInt();}

                    else{
                        System.out.println("Harga permalam: Rp. 915.000");
                    holiday = x.nextInt();}}

        else if(kamar == 8){         
        System.out.println("1. weekday");    
        System.out.println("2. weekend");    
        System.out.println("3. holiday");
        System.out.println("menginap di hari apa:");
        int hari = x.nextInt();
             if(hari == 1){
                System.out.println("Harga permalam:  Rp. 595.000");
                    weekday = x.nextInt();}

                else if(hari == 2){
                    System.out.println("Harga permalam: Rp.715.000");
                        weekend = x.nextInt();}

                    else{
                        System.out.println("Harga permalam: Rp. 915.000");
                            holiday = x.nextInt();}}

        else{                
        System.out.println("1. weekday");    
        System.out.println("2. weekend");    
        System.out.println("3. holiday");
        System.out.println("menginap di hari apa:");
        int hari = x.nextInt();
             if(hari == 1){
                System.out.println("Harga permalam:  Rp. 595.000");
                
                String pilih = "";
                if (pilih.equalsIgnoreCase("y")) {
                    
                }
                    weekday = x.nextInt();

                    System.out.println("akan bermalam berapa lama: ");
                    int malam = x.nextInt();
                
                    weekday = 595000 * malam;

                    System.out.println("total: " + weekday);
            }

                else if(hari == 2){
                    System.out.println("Harga permalam: Rp.715.000");
                        weekend = x.nextInt();
                    } else {
                        System.out.println("Harga permalam: Rp. 915.000");
                            holiday = x.nextInt();
                        }
                       


}


       






      


        
        

        
        
        
        
        

        


        
  }
 }


        
        
        
    
    

