package com.api.wiki.repository;

import com.api.wiki.entitys.ClassDocument;
import com.api.wiki.entitys.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ClassDocumentRepository  extends JpaRepository<ClassDocument, Long> {

    public ClassDocument findByClassDocumentTitle(String title);
    public ClassDocument findByClassDocumentPackage(String paquete);
    public ClassDocument findByClassDocumentType(String type);
    public ClassDocument findByClassDocumentExtends(String classExtends);
    public List<ClassDocument> findByClassDocumentUseContaining(String used);
    public List<ClassDocument> findByClassDocumentImplementsContaining(String classDocumentImplement);
    public List<ClassDocument>  findByClassDocumentPackageContaining(String paquete);
    public  List<ClassDocument>  findByClassDocumentTypeContaining(String type);
    public  List<ClassDocument> findByClassDocumentInject(String inject);
    public  List<ClassDocument> findByActive(Boolean active);

    public List<ClassDocument> findByClassDocumentUseContainingAndActive(String used, Boolean active);
    public List<ClassDocument> findByClassDocumentImplementsContainingAndActive(String classDocumentImplement, Boolean active);
    public List<ClassDocument>  findByClassDocumentPackageContainingAndActive(String paquete, Boolean active);
    public  List<ClassDocument>  findByClassDocumentTypeContainingAndActive(String type, Boolean active);

    @Query(nativeQuery = true, value = "SELECT * FROM class_document WHERE implement LIKE %?1%")
    public List<ClassDocument> findByClassDocumentImplementsLike(String classDocumentImplement);

    @Query(nativeQuery = true, value = "SELECT * FROM class_document WHERE used LIKE %?1%")
    public List<ClassDocument> findByClassDocumentUseLike(String ClassDocumentUse);

}
