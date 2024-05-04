package com.api.wiki.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RepositoryLinkDTO implements Serializable {

    private Long idRepositoryLink;
    private String name;
    private String repositoryLink;
}
