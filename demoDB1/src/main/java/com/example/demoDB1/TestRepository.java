package com.example.demoDB1;

import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<Test, String> {

	public Test findById(int id);
}
