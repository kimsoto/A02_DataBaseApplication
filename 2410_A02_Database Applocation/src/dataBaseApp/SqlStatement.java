package dataBaseApp;
/**
 * 
 * @author kim soto & jingwen zhang 
 * 
 * class provides sql statements that create fill or drop tables!
 *
 */

public class SqlStatement {
	//------------------players---------------------
	/*public static String dropTablePlayers = 
			"DROP TABLE Players";*/
	
	public static String createTablePlayers = 
			"CREATE TABLE Players (" 
			+ "PlayerID int not null primary key "
			+ "GENERATED ALWAYS AS IDENTITY "
			+ "(START WITH 100, INCREMENT BY 1), "
			+ "FirstName varchar(255), " 
			+ "LastName varchar(255), " 
			+ "Position varchar(255), " 
			+ "TeamID int)";
	
	public static String fillTablePlayers =
			"INSERT INTO Players (FirstName, LastName, Position,TeamID) VALUES " 
			+ "('Stephen', 'Curry', 'Point Guard', 111),"
			+ "('Klay', 'Thompson', 'Shooting Guard', 222),"
			+ "('Kevin', 'Durant', 'Small Forward', 333),"
			+ "('Demarcus', 'Cousins', 'Center', 444),"
			+ "('Draymond', 'Green', 'Power Forward', 555)";
	
	
	//---------------------teams-----------------------
	public static String dropTableTeams = 
			"DROP TABLE Teams";
	
	public static String createTableTeams = 
			"CREATE TABLE Teams (" 
			+ "TeamID int not null primary key "
			+ "GENERATED ALWAYS AS IDENTITY "
			+ "(START WITH 100, INCREMENT BY 1), "
			+ "TeamName varchar(255), " 
			+ "City varchar(255), " 
			+ "Titles int)";
	
	public static String fillTableTeams =
			"INSERT INTO Teams (TeamName, City, Titles) VALUES " 
			+ "('Golden State', 'Oakland', 6),"
			+ "('Jazz', 'Salt Lake City', 0),"
			+ "('Celtics', 'City: Boston', 17),"
			+ "('Spurs','City: San Antonio', 5),"
			+ "('Lakers', 'Los Angeles', 16)";
}
