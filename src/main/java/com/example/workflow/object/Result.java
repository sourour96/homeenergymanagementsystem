package com.example.workflow.object;

public class Result {
	private String starttime;
	private String Finishtime;
	private double PBSocMaxt;
	private double PBSocMint;
	private double Soct1;
	private double GridPower;
	private double PchBt;
	

	private double PdechBt;

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Result(String starttime, String finishtime, double pBSocMaxt, double pBSocMint, double soct1,
			double gridPower, double pbcht, double pdechBt) {
		super();
		this.starttime = starttime;
		Finishtime = finishtime;
		PBSocMaxt = pBSocMaxt;
		PBSocMint = pBSocMint;
		Soct1 = soct1;
		GridPower = gridPower;
		PchBt=pbcht;
		PdechBt=pdechBt;
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



	public double getPBSocMaxt() {
		return PBSocMaxt;
	}



	public void setPBSocMaxt(double pBSocMaxt) {
		PBSocMaxt = pBSocMaxt;
	}



	public double getPBSocMint() {
		return PBSocMint;
	}



	public void setPBSocMint(double pBSocMint) {
		PBSocMint = pBSocMint;
	}



	public double getSoct1() {
		return Soct1;
	}



	public void setSoct1(double soct1) {
		Soct1 = soct1;
	}



	public double getGridPower() {
		return GridPower;
	}



	public void setGridPower(double gridPower) {
		GridPower = gridPower;
	}
	
	public double getPchBt() {
		return PchBt;
	}



	public void setPchBt(double pchBt) {
		PchBt = pchBt;
	}

	
	public double getPdechBt() {
		return PdechBt;
	}



	public void setPdechBt(double pdechBt) {
		PdechBt = pdechBt;
	}
}



	