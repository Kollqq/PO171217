package pl.sport.zad24;

public class Results {
    private String firstName;
    private String lastName;
    private int[] results;

    public Results(String firstName, String lastName, int n){
        this.firstName = firstName;
        this.lastName = lastName;
        int[] results = new int[n];

    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void addResults(int index, int result){

    }
}
