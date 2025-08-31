package com.example.portfolio.model;

import java.util.List;

public class Project {
    private String title;
    private String description;
    private String imageUrl;
    private List<String> technologies;
    private String projectUrl;
    private String githubUrl;
    
    public Project(String title, String description, String imageUrl, 
                  List<String> technologies, String projectUrl, String githubUrl) {
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.technologies = technologies;
        this.projectUrl = projectUrl;
        this.githubUrl = githubUrl;
    }
    
    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    
    public List<String> getTechnologies() { return technologies; }
    public void setTechnologies(List<String> technologies) { this.technologies = technologies; }
    
    public String getProjectUrl() { return projectUrl; }
    public void setProjectUrl(String projectUrl) { this.projectUrl = projectUrl; }
    
    public String getGithubUrl() { return githubUrl; }
    public void setGithubUrl(String githubUrl) { this.githubUrl = githubUrl; }
}
