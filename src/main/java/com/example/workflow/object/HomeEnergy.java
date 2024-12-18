package com.example.workflow.object;

import com.google.firebase.database.GenericTypeIndicator;

public class HomeEnergy {
	private double homeDemandPower;
	private double wind;
	private double Pw;
	private double radiation;
	private double Ppv;
	private double Soct0;
	private String starttime;
	private String Finishtime;
	private double SocMax;
	private double SocMin;
	private double R;
	private double deltaT;
	private double Q;
	private long PBchL;
	private double PBdechL;
	private float prixAv;
	

	private float prixt;
	
	
	
	

	public HomeEnergy() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public HomeEnergy(double homeDemandPower, double wind, double pw, double radiation, double ppv, double soct0,
			String starttime, String finishtime, double socMax, double socMin, double r, double deltaT, double q,
			long pBchL, double pBdechL,float prixAv, float prixt)  {
		super();
		this.homeDemandPower = homeDemandPower;
		this.wind = wind;
		Pw = pw;
		this.radiation = radiation;
		Ppv = ppv;
		Soct0 = soct0;
		this.starttime = starttime;
		Finishtime = finishtime;
		SocMax = socMax;
		SocMin = socMin;
		R = r;
		this.deltaT = deltaT;
		Q = q;
		PBchL = pBchL;
		PBdechL = pBdechL;
		this.prixAv=prixAv;
		this.prixt=prixt;
	}

	public double getSoct0() {
		return Soct0;
	}
	public void setSoct0(double soct0) {
		Soct0 = soct0;
	}
	public double getSocMax() {
		return SocMax;
	}
	public void setSocMax(double socMax) {
		SocMax = socMax;
	}
	public double getSocMin() {
		return SocMin;
	}
	public void setSocMin(double socMin) {
		SocMin = socMin;
	}
	public double getR() {
		return R;
	}
	public void setR(double r) {
		R = r;
	}
	public double getDeltaT() {
		return deltaT;
	}
	public void setDeltaT(double deltaT) {
		this.deltaT = deltaT;
	}
	public double getQ() {
		return Q;
	}
	public void setQ(double q) {
		Q = q;
	}

	
	
	

	

	public double getHomeDemandPower() {
		return homeDemandPower;
	}
	public void setHomeDemandPower(double homeDemandPower) {
		this.homeDemandPower = homeDemandPower;
	}
	public double getWind() {
		return wind;
	}
	public void setWind(double wind) {
		this.wind = wind;
	}
	public double getPw() {
		return Pw;
	}
	public void setPw(int pw) {
		Pw = pw;
	}
	public double getRadiation() {
		return radiation;
	}
	public void setRadiation(double radiation) {
		this.radiation = radiation;
	}
	public double getPpv() {
		return Ppv;
	}
	public void setPpv(double ppv) {
		Ppv = ppv;
	}
	
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getFinishtime() {
		return Finishtime;
	}
	public void setFinishtime(String finishtime) {
		Finishtime = finishtime;
	}
	
	public double getPBchL() {
		return PBchL;
	}

	public void setPBchL(long pBchL) {
		PBchL = pBchL;
	}

	public double getPBdechL() {
		return PBdechL;
	}

	public void setPBdechL(double pBdechL) {
		PBdechL = pBdechL;
	}
	
	public float getPrixAv() {
		return prixAv;
	}



	public void setPrixAv(float prixAv) {
		this.prixAv = prixAv;
	}



	public float getPrixt() {
		return prixt;
	}



	public void setPrixt(float prixt) {
		this.prixt = prixt;
	}
	
}