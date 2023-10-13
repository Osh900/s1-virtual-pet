import javax.swing.JFrame;
import javax.swing.JOptionPane;




public class Runner{
     int money = 100;
     int guess = 0;
     int bet = 0;
     public Runner(){
    VirtualPet p = new VirtualPet();
    

     String ans = getResponse("Hi, my name is Phill. How was your day?");
     p.setMessage("Thats great");
     p.face1("happy");

     p.setMessage("im fealing very risky today. lets go gambling");
     p.face1("joyful");
     takeAbeat(3000);
     p.setMessage("you have" + money + " in your acount" );

     for (int i = 0; i < 15; i++ ){
          if (money > 0){
          bet = getIntResponse(" how much do you want to bet ");
               if (bet > money){
                bet = getIntResponse(" you dont have that much money bet again ");
               }
          guess = getIntResponse(" what number are you betting on 0 - 14 ");
               if(guess >=14){
                  guess = getIntResponse(" your number was to high. bet between 0 - 14 ");  
               }
          int intA = (int)(Math.random()*15);
          takeAbeat(1000);
               if (gamble(intA) == 1){
               p.face1("joyful"); 
               p.setMessage("YAAY! you have" + money + " in your acount" );
               takeAbeat(3000);
               p.setMessage("i must win more!");
               takeAbeat(2000);
               }
               else{
               p.face1("sad");
               p.setMessage("NOOOO! you have" + money + " in your acount" );
               takeAbeat(3000);
               if (money > 0){
               p.setMessage("lets go again. i cant end on a loss" );
               }
               takeAbeat(2000);
               }

          
          }

          else{
               p.setMessage(" i am out of money :(");
               p.face1("angel");
               break;
          }
     }

     p.setMessage("BYE!");



   }
     public int gamble(int d1) {
          if(d1 == guess){
               money = money + (bet * 14);
               return 1;
           } 
          else {
               money = money - bet;
               return 2;
          }
   }


     



   
   public String getResponse(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Get a Response",
                    JOptionPane.PLAIN_MESSAGE
    );
    return s;
   }

   public int getIntResponse(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Get a Response",
                    JOptionPane.PLAIN_MESSAGE
    );
    return Integer.parseInt(s);
   }

   public void takeAbeat(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch(Exception e){

        }
   }

   public static void main(String[] args) {
    new Runner(); 
   }
    
}