package com.api.wiki.service;

import com.api.wiki.dto.RepositoryLinkDTO;
import com.api.wiki.entitys.RepositoryLink;

public interface RepositoryLinkService {
    public RepositoryLinkDTO findByName(String name);
    public RepositoryLinkDTO findById(Long id);
    public RepositoryLinkDTO save(RepositoryLinkDTO repositoryLinkDTO);
}
