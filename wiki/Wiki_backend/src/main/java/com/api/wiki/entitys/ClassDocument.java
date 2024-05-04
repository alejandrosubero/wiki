package com.api.wiki.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "class_document")
public class ClassDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClassDocument;
    private String classDocumentTitle;
    private String classDocumentPackage;
    private String classDocumentType;
    private String classDocumentInject;
    private String classDocumentExtends;

    @Column(name = "implement")
    private String classDocumentImplements;

    @Column(name = "used")
    private String classDocumentUse;

    private String classDocumentDescription;
    private Date classDocumentDate;
    private Long idProject;
    private Boolean active;

}
