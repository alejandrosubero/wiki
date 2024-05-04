package com.api.wiki.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClassDocumentDTO implements Serializable {
    private Long idClassDocument;
    private String classDocumentTitle;
    private String classDocumentPackage;
    private String classDocumentType;
    private String classDocumentInject;
    private String classDocumentExtends;
    private String classDocumentImplements;
    private String classDocumentUse;
    private String classDocumentDescription;
    private Date classDocumentDate;
    private Boolean active;
}
