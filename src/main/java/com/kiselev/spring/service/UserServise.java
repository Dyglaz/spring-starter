package com.kiselev.spring.service;

import com.kiselev.spring.database.entity.Company;
import com.kiselev.spring.database.repository.CompanyRepository;
import com.kiselev.spring.database.repository.CrudRepository;
import com.kiselev.spring.database.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServise {

    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;

}
