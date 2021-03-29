package co.edu.iudigital.app.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.app.model.entity.Gender;
import co.edu.iudigital.app.model.repository.GenderRepository;
import co.edu.iudigital.app.service.Interface.GenderService;

@Service
public class GenderServiceImp implements GenderService {
	
	@Autowired
	private GenderRepository genderRepository;
	
	@Override
	public List<Gender> getAll() {
		// TODO Auto-generated method stub
		List<Gender> genders = new ArrayList<>();
		
		genders = (List<Gender>) genderRepository.findAll() ;
		return genders;
	}
}
