package com.avs.recipemongo.services;

import com.avs.recipemongo.commands.UnitOfMeasureCommand;
import reactor.core.publisher.Flux;

import java.util.Set;

/**
 * Created by jt on 6/28/17.
 */
public interface UnitOfMeasureService {

    Flux<UnitOfMeasureCommand> listAllUoms();
}
