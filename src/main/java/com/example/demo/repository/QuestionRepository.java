package com.example.demo.repository;

import com.example.demo.model.Question;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository<Question, String> {

	
}