package com.api.wiki.repository;

import com.api.wiki.entitys.RepositoryLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryLinkRepository extends JpaRepository<RepositoryLink, Long> {
    public RepositoryLink findByName(String name);
}
