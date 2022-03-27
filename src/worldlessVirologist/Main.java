package worldlessVirologist;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        boolean active = true;
        int input;
        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        Virologist v0= new Virologist("Player1");
        Virologist v1= new Virologist("Player2");
        Glove glove = new Glove();
        Cape cape = new Cape();
        Bag bag = new Bag();
 
        Stun stun = new Stun();
        Amnesia amnesia = new Amnesia();
        SpellShield spellshield = new SpellShield();
        Dance dance = new Dance();
        
        Nucleo nucleo = new Nucleo();
        Amino amino = new Amino();

        while(active) {
            System.out.println("1. Start Game\n" +
                    "2. Move a virologist\n" +
                    "3. Use agent on virologist\n" +
                    "4. Rob\n" +
                    "5. Make agent\n" +
                    "6. Move on shelter\n" +
                    "7. Move on storage\n" +
                    "11. Pick up material\n" +
                    "12. Move on laboratory\n" +
                    "13. Learn genetic code\n" +
                    "14. Quit\n");

            input = sc.nextInt();
            switch (input){
                case(1): game.StartGame(); break;
                case(2): v0.Move(v0.getField()); break;
                case(3): v0.Use(v1, stun); break;
                case(4): v0.StealItem(v1, bag); break;
                case(5): v0.Make(amino, stun); break;
                case(7): v0.PickUpItem(glove); break;
                case(14): active = false;
                break;

            }

        }
    }
}
