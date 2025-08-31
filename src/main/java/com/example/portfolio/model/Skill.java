package com.example.portfolio.model;

public class Skill {
    private String name;
    private int proficiency; // 1-100 percentage
    private String category;
    
    public Skill(String name, int proficiency, String category) {
        this.name = name;
        this.proficiency = proficiency;
        this.category = category;
    }
    
    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getProficiency() { return proficiency; }
    public void setProficiency(int proficiency) { this.proficiency = proficiency; }
    
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}
