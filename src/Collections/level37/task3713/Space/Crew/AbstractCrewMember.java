package Collections.level37.task3713.Space.Crew;

public abstract class AbstractCrewMember {
    public enum CompetencyLevel {
        NOVICE,
        INTERMEDIATE,
        ADVANCED,
        EXPERT;
    }

    protected CompetencyLevel competencyLevel;

    protected AbstractCrewMember nextCrewMember;

    public void setNextCrewMember(AbstractCrewMember nextCrewMember) {
        this.nextCrewMember = nextCrewMember;
    }

    public void handleRequest(CompetencyLevel competencyLevel, String request) {
        if (nextCrewMember.competencyLevel == CompetencyLevel.EXPERT) {
            doTheJob(request);
        } else if (nextCrewMember != null) {
            nextCrewMember.handleRequest(competencyLevel, request);
        }
    }

    protected abstract void doTheJob(String request);
}
