package com.gfike.postrgres;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface KayakDao extends CrudRepository<Kayak, Integer> {
}
