package com.digitalml.rest.resources.codegentest.application.domain.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import com.digitalml.rest.resources.codegentest.application.domain.model.Extend;

import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.ResourceRepositoryBase;
import io.katharsis.resource.list.ResourceList;

public class ExtendRepository extends ResourceRepositoryBase<Extend, Long> {

    private static final AtomicLong ID_GENERATOR = new AtomicLong(124);
    
    private Map<Long, Extend> projects = new HashMap<>();
    
    public ExtendRepository() {
		super(Extend.class);

        {
    		Extend object = new Extend();
    		object.setName("Hello");
    		save(object);
        }
        {		
    		Extend object = new Extend();
    		object.setName("StateFarm");
    		save(object);
        }
	}

	@Override
	public synchronized void delete(Long id) {
		projects.remove(id);
	}

	@Override
	public synchronized <S extends Extend> S save(S project) {
		if (project.getId() == null) {
			project.setId(ID_GENERATOR.getAndIncrement());
		}
		projects.put(project.getId(), project);
		return project;
	}

	@Override
	public synchronized ResourceList<Extend> findAll(QuerySpec querySpec) {
		return querySpec.apply(projects.values());
	}
}