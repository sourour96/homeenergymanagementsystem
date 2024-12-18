 package com.example.workflow.service;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.example.workflow.object.HomeEnergy;
import com.example.workflow.object.Result;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class FirebaseService {

	public String saveHomeEnergyDetails(HomeEnergy homeEnergy) throws InterruptedException, ExecutionException
	{
		Firestore dbfirestore=FirestoreClient.getFirestore();
		ApiFuture<WriteResult> collectionsApiFuture=dbfirestore.collection("HomeEnergy").document(homeEnergy.getFinishtime()).set(homeEnergy);
		return collectionsApiFuture.get().getUpdateTime().toString();
	}
	
	public HomeEnergy getHomeEnergyDetails(String Finishtime) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection("HomeEnergy").document(Finishtime);
        ApiFuture<DocumentSnapshot> future = documentReference.get();

        DocumentSnapshot document = future.get();

        HomeEnergy homeEnergy = null;

        if(document.exists()) {
        	homeEnergy = document.toObject(HomeEnergy.class);
            return homeEnergy;
        }else {
            return null;
        }
}
	
	public String updateHomeEnergyDetails(HomeEnergy homeEnergy) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection("HomeEnergy").document(homeEnergy.getFinishtime()).set(homeEnergy);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

	public String saveResults1(Result result) throws InterruptedException, ExecutionException
	{
		Firestore dbfirestore=FirestoreClient.getFirestore();
		ApiFuture<WriteResult> collectionsApiFuture=dbfirestore.collection("Results").document("PBSocMax").set(result);
		return collectionsApiFuture.get().getUpdateTime().toString();
	}

	
	public String saveResults(Result result) throws InterruptedException, ExecutionException
	{
		Firestore dbfirestore=FirestoreClient.getFirestore();
		ApiFuture<WriteResult> collectionsApiFuture=dbfirestore.collection("Results").document(result.getFinishtime()).set(result);
		return collectionsApiFuture.get().getUpdateTime().toString();
	}
}
