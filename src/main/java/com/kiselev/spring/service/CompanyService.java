package com.kiselev.spring.service;

import com.kiselev.spring.database.entity.Company;
import com.kiselev.spring.database.repository.CompanyRepository;
import com.kiselev.spring.database.repository.CrudRepository;
import com.kiselev.spring.dto.CompanyReadDto;
import com.kiselev.spring.listener.entity.AccessType;
import com.kiselev.spring.listener.entity.EntityEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CrudRepository<Integer, Company> companyRepository;
    private final UserServise userService;
    private final ApplicationEventPublisher eventPublisher;

    public Optional<CompanyReadDto> findById(Integer id) {
        return companyRepository.findById(id)
                .map(entity -> {
                    eventPublisher.publishEvent(new EntityEvent(entity, AccessType.READ));
                    return new CompanyReadDto(entity.id());
                });
    }

}
