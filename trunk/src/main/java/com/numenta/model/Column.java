package com.numenta.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.numenta.model.helper.CellHelper;


public class Column {
	
	
	public static int CELLS_PER_COLUMN;
	private double boost;
	private double overlap;
	public static  int MINIMAL_OVERLAP=2;//TODO choose reasonable overlap
	private double minimalDesiredDutyCycle;
	private double activeDutyCycle;
	public double getActiveDutyCycle() {
		return activeDutyCycle;
	}

	public void setActiveDutyCycle(double activeDutyCycle) {
		this.activeDutyCycle = activeDutyCycle;
	}


	private Map<CellHelper, Boolean> predictiveState=new HashMap<CellHelper, Boolean>();
	private Map<CellHelper, Boolean> activeState=new HashMap<CellHelper, Boolean>();

	public Map<CellHelper, Boolean> getActiveState() {
		return activeState;
	}

	public void setActiveState(Map<CellHelper, Boolean> activeState) {
		this.activeState = activeState;
	}

	public double getMinimalDesiredDutyCycle() {
		return minimalDesiredDutyCycle;
	}

	public void setMinimalDesiredDutyCycle(double minimalDesiredDutyCycle) {
		this.minimalDesiredDutyCycle = minimalDesiredDutyCycle;
	}

	
	public Map<CellHelper, Boolean> getPredictiveState() {
		return predictiveState;
	}

	public void setPredictiveState(Map<CellHelper, Boolean> predictiveState) {
		this.predictiveState = predictiveState;
	}


	private Column[] neigbours;
	
	
	private Synapse[] potentialSynapses;

	public double getOverlap() {
		return overlap;
	}

	public void setOverlap(double d) {
		this.overlap = d;
	}

	public Synapse[] getPotentialSynapses() {
		return potentialSynapses;
	}

	public void setPotentialSynapses(Synapse[] potentialSynapses) {
		this.potentialSynapses = potentialSynapses;
	}

	

	public Column[] getNeigbours() {
		return neigbours;
	}

	public void setNeigbours(Column[] neigbours) {
		this.neigbours = neigbours;
	}

	public Synapse[] getConnectedSynapses() {
		ArrayList<Synapse> connectedSynapses=new ArrayList<Synapse>();
		for(int i=0;i<potentialSynapses.length;i++){
			Synapse potentialSynapse=potentialSynapses[i];
			if(potentialSynapse.isActive()){
				connectedSynapses.add(potentialSynapse);
			}
		}
		return (Synapse[])connectedSynapses.toArray();
	}

	

	public double getBoost() {
		return boost;
	}

	public void setBoost(double boost) {
		this.boost = boost;
	}

	public double getConnectedPerm() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void increasePermanance(double d) {
		// TODO Auto-generated method stub
		
	}

	public Segment getActiveSegment(int cell, int time, String activeState) {
		// TODO Auto-generated method stub
		return null;
	}

}