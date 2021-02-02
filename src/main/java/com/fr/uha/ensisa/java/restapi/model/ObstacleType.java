package com.fr.uha.ensisa.java.restapi.model;

public class ObstacleType {

	public static final ObstacleType OTHER = new ObstacleType(0);
    public static final ObstacleType ENIGME = new ObstacleType(1);
    public static final ObstacleType WALK = new ObstacleType(2);
    
    private int value;

    private ObstacleType( int value ) {
        this.value = value;
    }

    public int toInt() {
        return value;   
    }
    
    public static ObstacleType fromInt( int value ) {
        switch( value ) {
            case 0: return OTHER;
            case 1: return ENIGME;
            default: return WALK;
        }
    }
	
	
	
	
}
