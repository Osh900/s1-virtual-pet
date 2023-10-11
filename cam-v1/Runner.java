import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner{
   public Runner(){
    VirtualPet p = new VirtualPet();
    int money = 100;

     String ans = getResponse("Hi, my name is Phill. How was your day?");
     p.setMessage("Thats great");
     p.face1("happy");

     p.setMessage("im fealing very risky today. lets go gambling");
     p.face1("joyful");
     takeAbeat(3000);
     p.setMessage("you have" + money + " in your acount" );

     int bet = getIntResponse(" what is your amount ");
     
     




     



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