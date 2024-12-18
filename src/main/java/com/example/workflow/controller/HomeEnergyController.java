package com.example.workflow.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workflow.compute.ComputingPBSocMaxt;
import com.example.workflow.service.FirebaseService;

@RestController
public class HomeEnergyController {

	@Autowired
	FirebaseService fireBaseService;
	Result res;
	ComputingPBSocMaxt  computingPBSocMaxt;
	@GetMapping("/getHomeEnergyDetails")
	public HomeEnergy  getHomeEnergyDetails(@RequestHeader String Finishtime) throws InterruptedException, ExecutionException {
		return fireBaseService.getHomeEnergyDetails(Finishtime);
	}
	@PostMapping("/createHomeEnergy")
	public String createNewHomeEnergy(@RequestBody HomeEnergy homeEnergy) throws InterruptedException, ExecutionException {
		return fireBaseService.saveHomeEnergyDetails(homeEnergy);
	}
	
	@PutMapping("/updateHomeEnergy")
	public String updateHomeEnergy(@RequestBody HomeEnergy homeEnergy) throws InterruptedException, ExecutionException {
		//return "Updated user "+person.getName();
		return fireBaseService.updateHomeEnergyDetails(homeEnergy);
	}
	
	@GetMapping("/computePBSocMaxt")
	public Result  setPBSocMaxtInProcess(@RequestHeader String Finishtime ) throws InterruptedException, ExecutionException  {
		HomeEnergy homeEnergy=fireBaseService.getHomeEnergyDetails(Finishtime);
		//return "Requesting details of User"+name;
		//double PBSocMaxt= computingPBSocMaxt.computePBSocMaxtInProcess(homeEnergy.getSocMax(),homeEnergy.getSoct0(),homeEnergy.getQ(), homeEnergy.getR(),homeEnergy.getDeltaT());
		System.out.println("1");
		
		double PBSocMaxt=(((homeEnergy.getSocMax()-homeEnergy.getSoct0())*homeEnergy.getQ())/(homeEnergy.getR()*homeEnergy.getDeltaT()))*(-1000);
		System.out.println("2");
		res=new Result();
		res.setPBSocMaxt(PBSocMaxt);
		System.out.println("3");
		res.setFinishtime(Finishtime);
		res.setStarttime(homeEnergy.getStarttime());;
		res.setGridPower(0);
		res.setPBSocMint(0);
		res.setSoct1(0);
		
		return res;
	}
	
	
	@GetMapping("/computePBSocMint")
	public Result  setPBSocMintInProcess(@RequestHeader String Finishtime ) throws InterruptedException, ExecutionException  {
		HomeEnergy homeEnergy=fireBaseService.getHomeEnergyDetails(Finishtime);
		//return "Requesting details of User"+name;
		//double PBSocMaxt= computingPBSocMaxt.computePBSocMaxtInProcess(homeEnergy.getSocMax(),homeEnergy.getSoct0(),homeEnergy.getQ(), homeEnergy.getR(),homeEnergy.getDeltaT());
		System.out.println("1");
		
		double PBSocMint=(((homeEnergy.getSocMin()-homeEnergy.getSoct0())*homeEnergy.getQ())/(homeEnergy.getR()*homeEnergy.getDeltaT()))*(-1000);
		System.out.println("2");
		res=new Result();
		res.setPBSocMint(PBSocMint);
		System.out.println("3");
		res.setFinishtime(Finishtime);
		res.setStarttime(homeEnergy.getStarttime());;
		res.setGridPower(0);
		res.setPBSocMaxt(0);
		res.setSoct1(0);
		
		return res;
	}
	
	@GetMapping("/computePdechBt")
	public Result  setPPdechBttInProcess(@RequestHeader String Finishtime ) throws InterruptedException, ExecutionException  {
		HomeEnergy homeEnergy=fireBaseService.getHomeEnergyDetails(Finishtime);
		//return "Requesting details of User"+name;
		//double PBSocMaxt= computingPBSocMaxt.computePBSocMaxtInProcess(homeEnergy.getSocMax(),homeEnergy.getSoct0(),homeEnergy.getQ(), homeEnergy.getR(),homeEnergy.getDeltaT());
		System.out.println("1");
		
		double PBSocMint=(((homeEnergy.getSocMin()-homeEnergy.getSoct0())*homeEnergy.getQ())/(homeEnergy.getR()*homeEnergy.getDeltaT()))*(-1000);
		System.out.println("2");
		res=new Result();
		res.setPBSocMint(PBSocMint);
		System.out.println("3");
		res.setFinishtime(Finishtime);
		res.setStarttime(homeEnergy.getStarttime());;
		res.setGridPower(0);
		res.setPBSocMaxt(0);
		res.setSoct1(0);
		
		return res;
	}
	
	/*@PostMapping("/saveResults1")
	public String createResults(@RequestHeader String PBSocMaxtch, @RequestHeader String PchBtch , @RequestHeader String PBSocMintch, @RequestHeader String PdechBtch ) throws InterruptedException, ExecutionException {
		//return "Created new user "+person.getName();
		
		res=new Result();
		res.setPBSocMaxt(Double.parseDouble(PBSocMaxtch));
		res.setPchBt(Double.parseDouble(PchBtch));
		res.setPdechBt(Double.parseDouble(PdechBtch));
		res.setFinishtime("06:00");
		res.setStarttime("05:30");
		res.setGridPower(0);
		res.setPBSocMint(Double.parseDouble(PBSocMintch));
		res.setSoct1(0);
		return fireBaseService.saveResults(res);
	}*/

	
	
	/*@PostMapping("/saveResults1")
	public String createResults( @RequestHeader String PBSocMintch, @RequestHeader String PdechBtch ) throws InterruptedException, ExecutionException {
		//return "Created new user "+person.getName();
		
		res=new Result();
		res.setPBSocMaxt(0);
		res.setPchBt(0);
		res.setPdechBt(Double.parseDouble(PdechBtch));
		res.setFinishtime("06:00");
		res.setStarttime("05:30");
		res.setGridPower(0);
		res.setPBSocMint(Double.parseDouble(PBSocMintch));
		res.setSoct1(0);
		return fireBaseService.saveResults(res);
	}*/
	
	/*@PostMapping("/saveResults1")
	public String createResults( @RequestHeader String PBSocMaxtch, @RequestHeader String PchBtch  ) throws InterruptedException, ExecutionException {
		//return "Created new user "+person.getName();
		
		res=new Result();
		res.setPBSocMaxt(Double.parseDouble(PBSocMaxtch));
		res.setPchBt(Double.parseDouble(PchBtch));
		res.setPdechBt(0);
		res.setFinishtime("06:00");
		res.setStarttime("05:30");
		res.setGridPower(0);
		res.setPBSocMint(0);
		res.setSoct1(0);
		return fireBaseService.saveResults(res);
	}*/
	@PostMapping("/saveResults")
	public String createResults(@RequestBody Result result ) throws InterruptedException, ExecutionException {
		//return "Created new user "+person.getName();
		
		return fireBaseService.saveResults(res);
	}
}
