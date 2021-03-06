/* Copyright josivanSilva (Developer); 2018 */
package com.josivansilva.sienge.constants;

/**
 * Class containing useful constants.
 * 
 * @author josivan@josivansilva.com
 *
 */
public class Constants {

	/**
	 * Transportation costs constants
	 */
	public static double PAVED_HIGHWAY_TRANSPORTATION_COST_PER_KILOMETER = 0.54;
	public static double UNPAVED_HIGHWAY_TRANSPORTATION_COST_PER_KILOMETER = 0.62;
	
	/**
	 * Vehicle type constants
	 */
	public static int VEHICLE_TYPE_CAMINHAO_BAU = 1;
	public static int VEHICLE_TYPE_CAMINHAO_CACAMBA = 2;
	public static int VEHICLE_TYPE_CARRETA = 3;
	
	/**
	 * Multiplier factor per vehicle type constants
	 */
	public static double MULTIPLIER_FACTOR_CAMINHAO_BAU = 1.00;
	public static double MULTIPLIER_FACTOR_CAMINHAO_CACAMBA = 1.05;
	public static double MULTIPLIER_FACTOR_CARRETA = 1.12;
	
	/**
	 * Freight carried constants. 
	 */
	public static int FREIGHT_CARRIED_5 = 5;
	public static double INCREMENT_PER_KILOMETER_WHEELED = 0.02;
			
}
