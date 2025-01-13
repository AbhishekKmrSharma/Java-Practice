package com.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.models.Student;

public interface IStudentDao extends MongoRepository<Student, Integer>
{

}
