package elec5620.sydney.edu.au.keyhealth.service;

import java.util.ArrayList;
import java.util.HashMap;

import elec5620.sydney.edu.au.keyhealth.models.AutoSuggestion;
import elec5620.sydney.edu.au.keyhealth.models.DietPlan;
import elec5620.sydney.edu.au.keyhealth.models.ExercisePlan;
import elec5620.sydney.edu.au.keyhealth.models.Target;

public interface PlanAndSuggestionService {
    void setTarget(Target target);
    void setDietPlan(DietPlan dietPlan);
    void setExercisePlan(ExercisePlan exercisePlan);

    HashMap<String,Object> getBasicInfo();

    AutoSuggestion getAutoSuggestion();
    ArrayList<AutoSuggestion> getTop5AutoSuggestion();


}
