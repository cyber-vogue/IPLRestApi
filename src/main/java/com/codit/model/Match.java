package com.codit.model;

public class Match {
private int matchId;
private String teamOneName;
private String teamtwoName;
private String date;
private String venue;
private String result;
public Match() {
	// TODO Auto-generated constructor stub
}
public Match(int matchId, String teamOneName, String teamtwoName, String date, String venue, String result) {
	super();
	this.matchId = matchId;
	this.teamOneName = teamOneName;
	this.teamtwoName = teamtwoName;
	this.date = date;
	this.venue = venue;
	this.result = result;
}
public int getMatchId() {
	return matchId;
}
public void setMatchId(int matchId) {
	this.matchId = matchId;
}
public String getTeamOneName() {
	return teamOneName;
}
public void setTeamOneName(String teamOneName) {
	this.teamOneName = teamOneName;
}
public String getTeamtwoName() {
	return teamtwoName;
}
public void setTeamtwoName(String teamtwoName) {
	this.teamtwoName = teamtwoName;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getVenue() {
	return venue;
}
public void setVenue(String venue) {
	this.venue = venue;
}
public String getResult() {
	return result;
}
public void setResult(String result) {
	this.result = result;
}
@Override
public String toString() {
	return "Match [matchId=" + matchId + ", teamOneName=" + teamOneName + ", teamtwoName=" + teamtwoName + ", date="
			+ date + ", venue=" + venue + ", result=" + result + "]";
}

}
