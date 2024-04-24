package com.dailytask.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailytask.entity.Updates;
import com.dailytask.repository.UpdatesRepository;

@Service
public class UpdatesServiceImpl implements UpdatesService {
	
	@Autowired
	private UpdatesRepository updatesRepository;
	
	
	@Override
	public Updates getByEmployeeId(int empId) {
		// TODO Auto-generated method stub
		
		Updates update=updatesRepository.findById(empId).get();
		return update;
	}

	@Override
	public List<Updates> getAllUpdates() {
		// TODO Auto-generated method stub
		return updatesRepository.findAll();
	}

	@Override
	public void saveUpdate(Updates update) {
		// TODO Auto-generated method stub
		
		String date= LocalDate.now().getDayOfMonth()+"/"+LocalDate.now().getMonth()+"/"+LocalDate.now().getYear(); 
		update.setDate(date);
		updatesRepository.save(update);
		
	}

}
