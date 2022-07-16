import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        // Get file to be read
        String file = scan.nextLine();
        ArrayList<Team> teams = getTeamsFromCSV(file);

        // Get Team to show data
            System.out.println("Name:");
            String inputTeam = scan.nextLine().toLowerCase();
            boolean onList = false;

            for (Team t : teams) {
                if (t.getName().equals(inputTeam)) {
                    onList = true;
                    System.out.println("Games: " + t.getGamesPlayed());
                    System.out.println("Wins: " + t.getWins());
                    System.out.println("Losses: " + t.getLosses());
                }
            }
            if(!onList) {
                System.out.println("Games: " + 0);
            }
    }

    public static ArrayList<Team> getTeamsFromCSV(String file) {
        ArrayList<Team> teams = new ArrayList<>();
        try {
            Scanner scanFile = new Scanner(Paths.get(file));
            while (scanFile.hasNextLine()) {
                String line = scanFile.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                String[] lineArr = line.split(",");
                String home = lineArr[0].toLowerCase();
                String visiting = lineArr[1].toLowerCase();
                int homePoints = Integer.parseInt(lineArr[2]);
                int visitingPoints = Integer.parseInt(lineArr[3]);

                boolean foundHome = false;
                boolean foundVisiting = false;

                for (Team t : teams) {
                    if (t.getName().equals(home) && !foundHome) {
                        t.play(homePoints, visitingPoints);
                        foundHome = true;
                        continue;
                    }
                    if (t.getName().equals(visiting) && !foundVisiting) {
                        t.play(visitingPoints, homePoints);
                        foundVisiting = true;
                    }
                }
                if (!foundHome) {
                    Team homeTeam = new Team(home);
                    homeTeam.play(homePoints, visitingPoints);
                    teams.add(homeTeam);
                }
                if (!foundVisiting) {
                    Team visitingTeam = new Team(visiting);
                    visitingTeam.play(visitingPoints, homePoints);
                    teams.add(visitingTeam);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return teams;
    }

}

