package yu_gi_oh.magic;

public class Magic {

	public String name;
	public String cardType;
	public String type;
	public String descriptionOrEffect;
	
	public Magic() {}
	
	public Magic(String name, String cardType, String type, String descriptionOrEffect) {
		this.name = name;
		this.cardType = cardType;
		this.type = type;
		this.descriptionOrEffect = descriptionOrEffect;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
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

	public void setDescriptionOrEffect(String descriptionOrEffect) {
		this.descriptionOrEffect = descriptionOrEffect;
	}
	
}
