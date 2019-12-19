package Collections.c37.task3713.Space.Crew;

public class FirstMate extends AbstractCrewMember {
    public FirstMate (AbstractCrewMember.CompetencyLevel competencyLevel) {
        this.competencyLevel = competencyLevel;
    }

    protected void doTheJob(String request) {
        System.out.println("The request " + request + " will be handled by first mate, let's not bother the captain with it.");
    }
}
