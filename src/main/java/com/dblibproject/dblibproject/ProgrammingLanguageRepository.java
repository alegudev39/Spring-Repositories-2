package com.dblibproject.dblibproject;

import com.dblibproject.dblibproject.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceRel = "programmingLanguages", itemResourceRel = "programmingLanguage", exported = true)
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}