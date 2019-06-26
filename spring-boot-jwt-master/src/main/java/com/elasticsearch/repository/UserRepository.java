package com.elasticsearch.repository;

import javax.transaction.Transactional;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.elasticsearch.model.User;
@Repository
public interface UserRepository extends ElasticsearchRepository<User, String> {

  //boolean existsByUsername(String username);

  User findByUsername(String username);

  //@Transactional
  void deleteByUsername(String username);

}
