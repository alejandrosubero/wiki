package com.api.wiki.mapper;

import com.api.wiki.dto.RepositoryLinkDTO;
import com.api.wiki.entitys.RepositoryLink;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class RepositoryLinkMapper {

    public RepositoryLink dtoToEntity(RepositoryLinkDTO dto) {
        return   dto != null?  new ModelMapper().map(dto, RepositoryLink.class): null;
    }

    public RepositoryLinkDTO entityToDto(RepositoryLink entity) {
        return entity != null?new ModelMapper().map(entity, RepositoryLinkDTO.class):null;
    }

    public List<RepositoryLink> listdtoToListEntity(List<RepositoryLinkDTO> listDto) {
        List<RepositoryLink> entitys = new ArrayList<>();
        if (listDto != null && listDto.size() > 0) {
            listDto.forEach(dTO -> entitys.add(this.dtoToEntity(dTO)));
        }
        return entitys;
    }

    public List<RepositoryLinkDTO> listentityToListDTO(List<RepositoryLink> listEntity) {
        return listEntity.stream().map(entity -> this.entityToDto(entity)).collect(Collectors.toList());
    }
}
