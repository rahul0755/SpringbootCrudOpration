package com.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.Model.BusinessRegistration;
import com.product.repository.BusninessRepository;

@Service
@Transactional
public class BusniessService {


	@Autowired
	BusninessRepository busninessRepository;

	public BusinessRegistration savebusniess(BusinessRegistration businessRegistration )
	{
		return busninessRepository.save(businessRegistration);

	}
	public Optional<BusinessRegistration> update(Long id){

		return busninessRepository.findById(id);
	}

	public Boolean delete(Long userId){

		busninessRepository.deleteById(userId);
		return true;
	}

	public Optional<BusinessRegistration> getById(Long userId){

		return busninessRepository.findById(userId);
	}

	public List<BusinessRegistration> getAll(){

		return (List<BusinessRegistration>) busninessRepository.findAll();
	}
	
	
	public boolean editBusinessObject(BusinessRegistration registration) {
		
		Long id=registration.getId();
		Optional<BusinessRegistration> db=update(id);
		
		BusinessRegistration registration2=db.get();
		
		
		registration2.setId(registration.getId());
		registration2.setCategoryId(registration.getCategoryId());
		registration2.setUserId(registration.getUserId());
		registration2.setNameOfbusiness(registration.getNameOfbusiness());
		registration2.setStreetAddress(registration.getStreetAddress());
		registration2.setPostalCode(registration.getPostalCode());
		registration2.setCity(registration2.getCity());
		registration2.setStateProvince(registration.getStateProvince());
		registration2.setLatitude(registration.getLatitude());
		registration2.setLongitude(registration.getLongitude());
		registration2.setCountry(registration.getCountry());
		
		busninessRepository.save(registration2);
		
		return true;
	}

}
