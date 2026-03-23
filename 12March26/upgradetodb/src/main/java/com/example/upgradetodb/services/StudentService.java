package com.example.upgradetodb.services;

import org.springframework.stereotype.Service;

import com.example.upgradetodb.dto.request.StudentRequest;
import com.example.upgradetodb.dto.response.StudentResponse;
import com.example.upgradetodb.entity.CollegeEntity;
import com.example.upgradetodb.entity.RegisterNumberEntity;
import com.example.upgradetodb.repository.RegistrationRepository;
import com.example.upgradetodb.repository.StudentRepository;
@Service
public class StudentService {
    private final StudentRepository repository;
    private final RegistrationRepository registrepository;

    public StudentService(StudentRepository repository,RegistrationRepository registrepository ) {
        this.repository = repository;
        this.registrepository = registrepository;
    }
    
    public StudentResponse getStudentDetails(StudentRequest req){
        CollegeEntity entity = new CollegeEntity();
        entity.setName(req.getName());

        CollegeEntity savStudentRepository = repository.save(entity);
        return new StudentResponse(savStudentRepository.getId(),savStudentRepository.getName(),null);

    }
    public StudentResponse assignRegistration(Long StudId, String regNo){
        CollegeEntity students = repository.findById(StudId).orElseThrow(() -> new RuntimeException("Student not found."));

        RegisterNumberEntity register = new RegisterNumberEntity();
        register.setRegNumber(regNo);
        RegisterNumberEntity savedRegister = registrepository.save(register);

        students.setRegisterNumberEntity(savedRegister);

        repository.save(students);

        return new StudentResponse(students.getId(), students.getName(), savedRegister.getRegNumber()); 
    }
}
        

