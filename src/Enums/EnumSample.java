package Enums;

public enum EnumSample {
    FIRST(1,"This is First"),
    SECOND(2,"This is Second"),
    THIRD(3,"This is Third");


    private int val;
    private String comment;

    EnumSample(int val,String comment){
        this.val = val;
        this.comment = comment;
    }

    public int getVal(){
        return val;
    }

    public String getComment(){
        return comment;
    }
}
