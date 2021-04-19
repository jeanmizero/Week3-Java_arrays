import java.util.Scanner;

public class TeamApp {

	public static void main(String[] args) {
		/*
		 * Add team member
		 * View team member
		 * View all team member
		 * Delete team member by position
		 * Delete all team members
		 */

//		1. create an array of team
		String [] team = new String[5];
		Scanner s = new Scanner(System.in);
		
		int decision = 0;
		
		while(decision != -1) {
			showMenu();
			decision = s.nextInt();	
			
			if (decision < -1 || decision == 2) {
				System.out.println("Please pick a valid option");
				
			}else if(decision == 1) {
				showTeam(team);
				
			}else if(decision == 2) {
				showTeamMember(team);
				
			}else if(decision == 3) {
				addTeamMember(team);
				
			}else if(decision == 4) {
				deleteAllTeamMembers(team)
				
			}else {
				
			}
			
			
		}

	}
	private static void deleteAllTeamMembers(String[] team) {
		// TODO Auto-generated method stub
		
	}
	private static void addTeamMember(String[] team) {
		// TODO Auto-generated method stub
		
	}
	private static void showTeamMember(String[] team) {
		// TODO Auto-generated method stub
		
	}
	private static void showTeam(String[] team) {
		// TODO Auto-generated method stub
		System.out.println("Team:");
		for (int i = 0; i < team.length; i++) {
			System.out.println(i + " : " + team[i]);	
		}
		
	}
	// create method
	public static void showMenu() {
		System.out.println("Please pick an option or enter -1 to exit");
		System.out.println("1) Show team");
		System.out.println("2) Show team member");
		System.out.println("3  Add team member)");
		System.out.println("4) Delete team member");
		System.out.println("5) Delete all team member");
		
	}

}
