package com.whzw.sc;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
	
    List<Doctor> findByName(String name);

}
