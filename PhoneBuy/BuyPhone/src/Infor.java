public class Infor {
    String name,memory,tech;
    //achieve the method of inputing
    public Infor(String name,String memory,String tech){
        this.name=name;
        this.memory=memory;
        this.tech=tech;
    }
    /////////////////////////////////////////////////////////////////////
    public String getName() {
        return name;
    }
    /////////////////////////////////////////////////////////////////////
    public String toString(){
        return name +" "+memory +" "+ tech;
    }

}
