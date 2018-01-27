package com.test.git.repo.IssueDetails;

import java.util.List;

public class Repo {
	private String name;
	
	private List<Issue> issues;
	
	public String getIssues_url() {
		return issues_url;
	}

	public void setIssues_url(String issues_url) {
		this.issues_url = issues_url;
	}

	private String issues_url;
	
	public List<Issue> getIssues() {
		return issues;
	}

	public void setIssues(List<Issue> issues) {
		this.issues = issues;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
