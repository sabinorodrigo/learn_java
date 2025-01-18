package yu_gi_oh.monster;

public class Monster {

    private String name;
    private double attack;
    private double defense;
    private int level;
    private String type;
    private String attribute;
    private String cardType;
    private int passcode;
    private String statuses;
    private String descriptionOrEffect;

    public Monster() {}

    public Monster(String name, double attack, double defense, int level, String type, String attribute,
            String cardType, int passcode, String statuses, String descriptionOrEffect) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.level = level;
        this.type = type;
        this.attribute = attribute;
        this.cardType = cardType;
        this.passcode = passcode;
        this.statuses = statuses;
        this.descriptionOrEffect = descriptionOrEffect;
    }

    public String toString() {
        return String.format("%nName: %s%nAttack: %.0f%nDefense: %.0f%nLevel: %d%nType: %s%nAttribute: %s%nCard Type: %s%nPasscode: %d%nStatuses: %s%n%nDescription/Effect: %s%n", 
        getName(), getAttack(), getDefense(), getLevel(), getType(), getAttribute(), getCardType(), getPasscode(), getStatuses(), getDescriptionOrEffect());
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getPasscode() {
        return passcode;
    }

    public void setPasscode(int passcode) {
        this.passcode = passcode;
    }

    public String getStatuses() {
        return statuses;
    }

    public void setStatuses(String statuses) {
        this.statuses = statuses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescriptionOrEffect() {
        return descriptionOrEffect;
    }

    public void setDescriptionOrEffect(String description) {
        this.descriptionOrEffect= description;
    }

}
