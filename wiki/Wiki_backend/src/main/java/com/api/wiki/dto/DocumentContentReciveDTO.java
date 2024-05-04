package com.api.wiki.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocumentContentReciveDTO implements Serializable {
  private @Builder.Default List<ClassDocumentDTO> documents = new ArrayList<>();
}
