package com.dailytask.service;

import java.util.ArrayList;
import java.util.List;

import com.dailytask.entity.Updates;

public interface UpdatesService {
	Updates getByEmployeeId(int empId);
	
	List<Updates> getAllUpdates();
	
	void saveUpdate(Updates update);
}
