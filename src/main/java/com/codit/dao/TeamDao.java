package com.codit.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.codit.model.Team;

@Repository
public class TeamDao {
	ArrayList<Team> teams = new ArrayList<Team>();

	public TeamDao() {
		teams.add(new Team(3, "SRH", "Hydrabad", "abc"));
		teams.add(new Team(4, "KKR", "Kolkata", "xyz"));
	}

	public String addTeam(Team team) {
		teams.add(team);
		return "team added successfully";

	}

	public ArrayList<Team> getAllTeams() {
		return teams;

	}

	public Team getTeamById(int id) {
		for (Team team : teams) {
			if (team.getTeamId() == id) {
				return team;
			}

		}
		return null;

	}

	public int deleteTeam(int id) {

		for (Team team : teams) {
			if (team.getTeamId() == id) {
				teams.remove(team);

				return 1;
			}
		}
		return 0;
	}

	public int updateTeam(Team team, int id) {
		int status = deleteTeam(id);
		if (status == 1) {
			teams.add(team);
			return 1;
		} else {
			return 0;
		}
	}
}
