package com.api.wiki.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "sub_task")
public class SubTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sub_task_ob")
    private Long idSubTask;
    private String titleSubTask;
    private Long taskReferenceId;
    private Long IdProject;
    private String taskType;
    private String description;
    private String state;
    private Long time; // hours
    private String solution;
    private Date createDate;
    private Date endDate;
    private String personCreate;
    private String personWorked;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_sub_task")
    private @Builder.Default List<TaskNote> taskNote = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_sub_task")
    private @Builder.Default List<PaquetePackage> packages = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_sub_task_class_document")
    private @Builder.Default List<ClassDocument> classDocumentsList = new ArrayList<>();

}
