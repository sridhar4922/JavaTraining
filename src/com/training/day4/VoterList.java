package com.training.day4;


class Voter {
    private int voterID;
    private String name;
    private int age;

    public Voter(int voterID,String name,int age) throws invaidAgeException {
        if (age < 18){
            throw new invaidAgeException("age is not vaild age must be above 18. ");
        }
        this.voterID=voterID;
        this.name=name;
        this.age=age;
    }
}

class invaidAgeException extends Exception{
    public invaidAgeException (String message){
        super(message);
    }
}

public class VoterList{
    public static void main(String[] args) {
        try {
            Voter vaildVoter = new Voter(1,"Peter",10);
        } catch (invaidAgeException e) {
            System.out.println("Exception "+ e.getMessage());
        }

    }
}


/*

OUTPUT:

Exception age is not vaild age must be above 18.
 */