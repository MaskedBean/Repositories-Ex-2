package com.example.Repositories.Ex2.repositories;

import com.example.Repositories.Ex2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("Description"))
public interface LanguagesRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
