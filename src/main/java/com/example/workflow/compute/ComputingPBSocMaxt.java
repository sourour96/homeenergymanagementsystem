package com.example.workflow.compute;

import java.util.concurrent.ExecutionException;

import com.example.workflow.object.HomeEnergy;
import com.example.workflow.service.FirebaseService;

public class ComputingPBSocMaxt {
	public  double PBSocMaxt;
	
	public double computePBSocMaxt(String Finishtime) throws InterruptedException, ExecutionException
	{
		FirebaseService firebaseService = null;
		HomeEnergy homeEnergy=firebaseService.getHomeEnergyDetails(Finishtime);
		PBSocMaxt=((homeEnergy.getSocMax()-homeEnergy.getSoct0())*homeEnergy.getQ())/(homeEnergy.getR()*homeEnergy.getDeltaT());
		return PBSocMaxt;
		
	}
	
	public double computePBSocMaxtInProcess(double SocMax, double Soct0, double Q,  double R, double DeltaT) 
	{
		
		PBSocMaxt=((SocMax-Soct0)*Q)/(R*DeltaT);
		System.out.println("PBSocMaxt"+PBSocMaxt);
		return PBSocMaxt;
		
	}

}
