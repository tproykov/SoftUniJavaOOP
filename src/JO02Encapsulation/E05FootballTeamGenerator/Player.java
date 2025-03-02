package JO02Encapsulation.E05FootballTeamGenerator;

public class Player {

    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble,
                  int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setEndurance(int endurance) {
        if (endurance < 0) {
            throw new IllegalArgumentException("Endurance should be between 0 and 100.");
        }
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        this.shooting = shooting;
    }

    public double overallSkillsLevel() {
        return (this.endurance + this.sprint + this.dribble + this.passing +
                this.shooting) / 5.0;
    }
}