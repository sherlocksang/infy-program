import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class InfyCupCricketSelection {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noOfPlayers = scan.nextInt();

        List<Player> playersList = new ArrayList<>();
        for (int i = 1; i <= noOfPlayers; i++) {
            Player player = new Player(scan.next(), scan.nextDouble(), scan.next());
            playersList.add(player);
        }

        Map<Integer, Player> finalSetOfPlayers = new HashMap<>();
        finalSetOfPlayers = Player.selectionProcess(playersList, noOfPlayers);
        System.out.println(finalSetOfPlayers);
        scan.close();

    }

}

class customSorting implements Comparator<Player>{
	 
	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		
		int av = o2.getAvarage().compareTo(o1.getAvarage());
		int ag = o1.getPlayerDOB().compareTo(o2.getPlayerDOB());
		int nm = o1.getPlayerName().compareTo(o2.getPlayerName());
		
		if(av != 0){
            return (av);
        }
		else if(ag != 0) {
			return (ag);
        }
		else {
			return nm;
		}
		
		//return 0;
	}
}

class Player{
    private String playerName;
    private Double avarage;
    private String playerDOB;

    public Player(String playerName, Double avarage, String playerDOB) {
        super();
        this.playerName = playerName;
        this.avarage = avarage;
        this.playerDOB = playerDOB;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Double getAvarage() {
        return avarage;
    }

    public void setAvarage(Double avarage) {
        this.avarage = avarage;
    }

    public String getPlayerDOB() {
        return playerDOB;
    }

    public void setPlayerDOB(String playerDOB) {
        this.playerDOB = playerDOB;
    }

    

    @Override
    public String toString() {
        return this.playerName + "";
    }

    public static Map<Integer, Player> selectionProcess(List<Player> playerList, int noOfPlayers) {
        //Write your logic as per the instructions
    	
    	Collections.sort(playerList , new customSorting());
    	 Map<Integer, Player> ans = new HashMap<>();
    	 
    	 //Collections.reverse(playerList);
    	for(int i =0 ;i<noOfPlayers;i++) {
    		ans.put(i+1, playerList.get(i));
    		//System.out.println(i);
    	}
        return ans;

    }
}