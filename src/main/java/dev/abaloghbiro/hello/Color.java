package dev.abaloghbiro.hello;

public enum Color{

    RED("red color"), BLUE("blue color"), GREEN("green color");

    private String description;



    private Color(String desc){
        this.description = desc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
