package com.kiselev.spring.database.repository;

import com.kiselev.spring.bpp.Auditing;
import com.kiselev.spring.bpp.InjectBean;
import com.kiselev.spring.bpp.Transaction;
import com.kiselev.spring.database.entity.Company;
import com.kiselev.spring.database.pool.ConnectionPool;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Transaction
@Auditing
@RequiredArgsConstructor
public class CompanyRepository implements CrudRepository<Integer, Company> {

    private final ConnectionPool pool1;
    private final List<ConnectionPool> pools;
    @Value("${db.pool.size}")
    private final Integer poolSize;

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("findById method...");
        return Optional.of(new Company(id, null, Collections.emptyMap()));
    }

    @PostConstruct
    private void init() {
        System.out.println("init company repository");
    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete method...");
    }

}
