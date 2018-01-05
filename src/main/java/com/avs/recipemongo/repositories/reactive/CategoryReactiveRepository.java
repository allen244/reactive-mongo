package com.avs.recipemongo.repositories.reactive;

import com.avs.recipemongo.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface CategoryReactiveRepository extends ReactiveMongoRepository<Category, String> {


    Mono<Category> findByDescription(String description);
}
