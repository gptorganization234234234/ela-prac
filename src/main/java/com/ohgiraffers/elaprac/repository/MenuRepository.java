package com.ohgiraffers.elaprac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ohgiraffers.elaprac.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
