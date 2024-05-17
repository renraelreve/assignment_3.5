public class Pet {

  private String name;
  private String breed;
  private String gender;
  private Integer age;
  private Boolean isVaccinated;

  public Pet() {
  }

  public Pet(String name, String breed, String gender, Integer age, Boolean isVaccinated) {
    this.name = name;
    this.breed = breed;
    this.gender = gender;
    this.age = age;
    this.isVaccinated = isVaccinated;
  }

  // Methods

  public void call(String sound) {
    System.out.println(sound);
    System.out.println(sound);
    System.out.println(sound);
  }

  public void eat(String food) {
    System.out.println(this.name + " loves eating " + food);
  }

  public void sleep() {
    System.out.println(this.name + " is currently sleeping");
  }

  // Getters and Setters
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBreed() {
    return this.breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public String getGender() {
    return this.gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Integer getAge() {
    return this.age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Boolean isIsVaccinated() {
    return this.isVaccinated;
  }

  public Boolean getIsVaccinated() {
    return this.isVaccinated;
  }

  public void setIsVaccinated(Boolean isVaccinated) {
    this.isVaccinated = isVaccinated;
  }
}