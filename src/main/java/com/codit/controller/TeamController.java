package com.codit.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codit.model.Team;
import com.codit.service.TeamService;

@RestController
public class TeamController {
	@Autowired
	TeamService teamService;

	@PostMapping("/api/teams")
	public String addTeam(@RequestBody Team team) {
		String msg = teamService.addTeam(team);
		return msg;

	}

	@GetMapping("/api/teams")
	public ArrayList<Team> getAllTeams() {
		ArrayList<Team> allTeams = teamService.getAllTeams();
		return allTeams;

	}

	@GetMapping("/api/team")
	public Object getTeamById(@RequestParam int id) {
		Team team = teamService.getTeamById(id);
		if (team != null) {
			return team;
		} else {
			return "team not found";
		}

	}

	@DeleteMapping("/api/teams/{id}")
	public String deleteTeam(@PathVariable int id) {
		String msg = teamService.deleteTeam(id);
		return msg;
	}
	@PutMapping("/api/teams/{id}")
	public String updateTeam(@RequestBody Team team, @PathVariable int id) {
		String msg = teamService.updateTeam(team, id);
		return msg;
	}
}
