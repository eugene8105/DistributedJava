package edu.wctc.pirates;

import edu.wctc.pirates.service.CrewService;
import edu.wctc.pirates.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
public class TrainingController {

    @Autowired
    private CrewService crewService;

    @Autowired
    private TrainingService trainingService;

    @Secured("crew")
    @RequestMapping("/submit-training")
    public String scoreQuiz(HttpServletRequest request,
                            Principal principal) {
        trainingService.gradeTraining(principal.getName(),
                request.getParameterMap());

        return "redirect:/my-training";
    }

    @Secured("crew")
    @RequestMapping("/take-training")
    public String showQuizPage(Model model,
                               @RequestParam("id") int trainingId) {
        model.addAttribute("training", trainingService.getTraining(trainingId));
        return "quiz";
    }

    @RequestMapping("/training-report")
    public String showReport(Model model) {
        model.addAttribute("crewList", crewService.getAllCrewMembers());
        return "all-pirates";
    }

    @Secured("crew")
    @RequestMapping("/my-training")
    public String showTrainingRecord(Model model,
                                     Principal principal) {
        model.addAttribute("me", crewService.getCrewMember(principal.getName()));
        return "training-record";
    }
}
