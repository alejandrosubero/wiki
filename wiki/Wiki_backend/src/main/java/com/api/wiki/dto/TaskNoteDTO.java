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
public class TaskNoteDTO implements Serializable {
    private Long idTaskNote;
    private String note;
    private String titleTaskNote;
    private Boolean addToDocument;
}
