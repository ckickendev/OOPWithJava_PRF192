package Semeter2_OOP_With_Jav_a.WS5.Part2.PlanManagement;

public class GetPlanFactory {
    public Plan getPlan(String planType){
        if (planType==null){
            return null;
        }
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }
        else if(planType.equalsIgnoreCase("DOMESTICPLAN")){
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")){
            return new InstitutionalPlan();
        }
        return null;
    }
}
