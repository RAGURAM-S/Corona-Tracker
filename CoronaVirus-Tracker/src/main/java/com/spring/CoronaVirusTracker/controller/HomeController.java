package com.spring.CoronaVirusTracker.controller;

import com.spring.CoronaVirusTracker.models.LocationStats;
import com.spring.CoronaVirusTracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allStats = coronaVirusDataService.getStats();
        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestCaseCount()).sum();
        int totalDelta = allStats.stream().mapToInt(stat -> stat.getDelta()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases", totalReportedCases);
        model.addAttribute("totalNewCases", totalDelta);
        return "home";
    }

}
