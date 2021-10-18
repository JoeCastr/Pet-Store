
public class Monkey extends RescueAnimal {
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;
	
	public Monkey(String name, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, String tailLength, String height,
	String bodyLength, String species) {
		setName(name);
		setAnimalType("Monkey");
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setSpecies(species);
	}
	
	//Getter
	public String getTailLength() {
		return tailLength;
	}
	
	//Setter
	public void setTailLength(String len) {
		tailLength = len;
	}
	
	//Getter
	public String getHeight() {
		return height;
	}
		
	//Setter
	public void setHeight(String h) {
		height = h;
	}

	//Getter
	public String getBodyLength() {
		return bodyLength;
	}
	
	//Setter
	public void setBodyLength(String bl) {
		bodyLength = bl;
	}
	
	//Getter
	public String getSpecies() {
		return species;
	}	
	
	//Setter
	public void setSpecies(String specie) {
		species = specie;
	}	
	
}
