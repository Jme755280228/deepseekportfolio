package com.example.portfolio.controller;

import com.example.portfolio.model.Skill;
import com.example.portfolio.model.Project;
import com.example.portfolio.model.Experience;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Controller
public class PortfolioController {    
    // Home page
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "John Doe");
        model.addAttribute("title", "Full Stack Developer");
        model.addAttribute("about", "I'm a passionate developer with 5+ years of experience in building web applications. I love solving complex problems and learning new technologies.");
        return "home";
    }
    
    // Skills page
    @GetMapping("/skills")
    public String skills(Model model) {
        List<Skill> skills = Arrays.asList(
            new Skill("Java", 90, "Backend"),
            new Skill("Spring Boot", 85, "Backend"),
            new Skill("Thymeleaf", 80, "Frontend"),
            new Skill("JavaScript", 75, "Frontend"),
            new Skill("HTML/CSS", 85, "Frontend"),
            new Skill("MySQL", 70, "Database"),
            new Skill("Git", 80, "Tools")
        );
        model.addAttribute("skills", skills);
        return "skills";
    }
    
    // Projects page
    @GetMapping("/projects")
    public String projects(Model model) {
        List<Project> projects = Arrays.asList(
            new Project(
                "E-Commerce Platform", 
                "A full-featured online shopping platform with user authentication, product management, and payment processing.",
                "/images/project1.png",
                Arrays.asList("Java", "Spring Boot", "Thymeleaf", "MySQL"),
                "https://example-ecommerce.com",
                "https://github.com/johndoe/ecommerce-platform"
            ),
            new Project(
                "Task Management App", 
                "A collaborative task management application with real-time updates and team collaboration features.",
                "/images/project2.jpg",
                Arrays.asList("JavaScript", "React", "Node.js", "MongoDB"),
                "https://example-tasks.com",
                "https://github.com/johndoe/task-manager"
            ),
            new Project(
                "Weather Dashboard", 
                "A responsive weather application that displays current and forecasted weather conditions for any location.",
                "/images/project3.png",
                Arrays.asList("HTML", "CSS", "JavaScript", "Weather API"),
                "https://example-weather.com",
                "https://github.com/johndoe/weather-dashboard"
            )
        );
        model.addAttribute("projects", projects);
        return "projects";
    }
    
    // Experience page
    @GetMapping("/experience")
    public String experience(Model model) {
        List<Experience> experiences = Arrays.asList(
            new Experience(
                "Tech Solutions Inc.", 
                "Senior Developer",
                "Led a team of 5 developers in building enterprise applications. Implemented CI/CD pipelines reducing deployment time by 40%.",
                LocalDate.of(2020, 6, 1),
                LocalDate.now(),
                true
            ),
            new Experience(
                "Web Innovations LLC", 
                "Full Stack Developer",
                "Developed and maintained multiple client websites using Java, Spring, and React. Improved application performance by 30%.",
                LocalDate.of(2018, 3, 1),
                LocalDate.of(2020, 5, 31),
                false
            ),
            new Experience(
                "StartUp Ventures", 
                "Junior Developer",
                "Built responsive web interfaces and implemented RESTful APIs. Participated in agile development processes.",
                LocalDate.of(2017, 1, 1),
                LocalDate.of(2018, 2, 28),
                false
            )
        );
        model.addAttribute("experiences", experiences);
        return "experience";
    }
    
    // Contact page
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}
