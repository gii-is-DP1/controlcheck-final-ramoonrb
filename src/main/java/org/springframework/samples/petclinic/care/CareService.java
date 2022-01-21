package org.springframework.samples.petclinic.care;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CareService {    

	@Autowired
	CareProvisionRepository careprovisionrepository;
	
    public List<Care> getAllCares(){
        return null;
    }

    public List<Care> getAllCompatibleCares(String petTypeName){
        List<Care> lista = careprovisionrepository.findCompatibleCares(petTypeName);
        return lista;
    }

    public Care getCare(String careName) {
        Care c = careprovisionrepository.findCareByName(careName);
        return c;
    }

    
    public CareProvision save(CareProvision p) throws NonCompatibleCaresException, UnfeasibleCareException {
        return null;   
    }

    public List<CareProvision> getAllCaresProvided(){
        List<CareProvision> lista = careprovisionrepository.findAll();
        return lista;
    }

    public List<CareProvision> getCaresProvided(Integer visitId){
        return null;

    }
    
}
