package com.product.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.Model.User;
import com.product.repository.UserRepository;

@Service
@Transactional
public class UserService {
			
	@Autowired
	UserRepository userRepository;
	
	public User save( User user)
	{
		return 	userRepository.save(user);
	
		
	}
	 public Optional<User> update(Long id){

	     return userRepository.findById(id);
		
	         
	    }

	    public Boolean delete(Long userId){

	        userRepository.deleteById(userId);
	      return true;
	    }

	    public Optional<User> getById(Long userId){

	        return userRepository.findById(userId);
	    }

	    public List<User> getAll(){

	        return (List<User>) userRepository.findAll();
	    }

	    public boolean editUserObject(User user)
		{
			Long id=user.getId();
			
			Optional<User> c1=update(id);
			
			User dbcar=c1.get();
			
			dbcar.setId(user.getId());
			dbcar.setFisrtname(user.getFisrtname());
			dbcar.setLastname(user.getLastname());
			dbcar.setAddress(user.getAddress());
			dbcar.setEmailId(user.getEmailId());
			dbcar.setDeviceId(user.getDeviceId());
			dbcar.setIsBusniessowner(user.getIsBusniessowner());
			dbcar.setPassword(user.getPassword());
			dbcar.setOs(user.getOs());		
			
			userRepository.save(dbcar);
			
			return true;
		}
}
