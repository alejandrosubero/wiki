package com.api.wiki.service.implment;

import com.api.wiki.dto.RepositoryLinkDTO;
import com.api.wiki.entitys.RepositoryLink;
import com.api.wiki.mapper.RepositoryLinkMapper;
import com.api.wiki.repository.RepositoryLinkRepository;
import com.api.wiki.service.RepositoryLinkService;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RepositoryLinkServiceImplement implements RepositoryLinkService {

    private RepositoryLinkRepository repository;
    private RepositoryLinkMapper mapper;

    public RepositoryLinkServiceImplement(RepositoryLinkRepository repository, RepositoryLinkMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public RepositoryLinkDTO findByName(String name) {
        try {
            return mapper.entityToDto(repository.findByName(name));
        }catch (DataAccessException e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public RepositoryLinkDTO findById(Long id) {
        try {
            Optional<RepositoryLink> repositoryLink = repository.findById(id);
            if(repositoryLink.isEmpty()){
                return mapper.entityToDto(repositoryLink.get());
            }
        }catch (DataAccessException e){
            e.printStackTrace();
            return null;
        }
        return null;
    }

    @Override
    public RepositoryLinkDTO save(RepositoryLinkDTO repositoryLinkDTO) {
        try {
            RepositoryLink repositoryLink = repository.save(mapper.dtoToEntity(repositoryLinkDTO));
            if(repositoryLink != null){
                return mapper.entityToDto(repositoryLink);
            }
        }catch (DataAccessException e){
            e.printStackTrace();
            return null;
        }
        return null;
    }
}
