package com.codit.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codit.dao.TeamDao;
import com.codit.model.Team;

@Service
public class TeamService {
	@Autowired
	TeamDao teamDao;

	public String addTeam(Team team) {

		String msg = teamDao.addTeam(team);
		return msg;

	}

	public ArrayList<Team> getAllTeams() {
		ArrayList<Team> allTeams = teamDao.getAllTeams();
		return allTeams;

	}

	public Team getTeamById(int id) {
		Team team = teamDao.getTeamById(id);
		return team;

	}

	public String deleteTeam(int id) {
		int status = teamDao.deleteTeam(id);
		if (status == 1) {
			return "team deleted";
		}
		else {
			return "team not found to delete";
		}
	}
	public String updateTeam(Team team, int id) {
		int status = teamDao.updateTeam(team, id);
		if (status==0) {
			return "team not found to update";
		}
		else {
			return "team updated";
		}
	}
}
