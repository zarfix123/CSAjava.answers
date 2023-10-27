public class PlayerTester
{
    public static void main(String[] args) {
       
       //Start here
       CricketPlayer p1 = new CricketPlayer("johnson", "jews");
       CricketPlayer p2 = new CricketPlayer("monkey");
       
       p1.addMatch(1, 5);
       p1.addMatch(1, 5);
       p1.addMatch(1, 5);
       p1.addMatch(1, 5);
       
       p2.addMatch(1, 5);
       p2.addMatch(1, 5);
       p2.addMatch(1, 5);
       p2.addMatch(1, 5);
       
       System.out.println("Johnson's Stats: ");
       p1.printRunsScored();
       p1.printBallsBowled();
       System.out.println(p1);
       
       
       System.out.println();
       System.out.println("monkeys's Stats: ");
       p2.printRunsScored();
       p2.printBallsBowled();
       System.out.println(p2);
       
       
       
       
    }
}
