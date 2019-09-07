

enum Gender{
	male,female
}
enum Nationality{
	Latvian,Estonian,Turkish
}


public class Person {
	
	
private  String name;
private String surname;
private String passportcode;
private Gender gender;
private Nationality nationality;



public Person(){
name="John";
surname="Smith";
passportcode="1234455677";
gender=Gender.male;
nationality=Nationality.Estonian;

}

public  Person(String n,String s,String p)
{
	name=n;
	surname=s;
	passportcode=p;
	
}
public Person(String n,String s,String p,Gender g,Nationality na) {
	name=n;
	surname=s;
	passportcode=p;
	gender=g;
	nationality=na;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public String getPassportcode() {
	return passportcode;
}

public void setPassportcode(String passportcode) {
	this.passportcode = passportcode;
}

public Gender getGender() {
	return gender;
}

public void setGender(Gender gender) {
	this.gender = gender;
}

public Nationality getNationality() {
	return nationality;
}

public void setNationality(Nationality nationality) {
	this.nationality = nationality;
}
//veritifications in set methods





}

