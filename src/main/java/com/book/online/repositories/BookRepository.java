package com.book.online.repositories;

import com.book.online.entities.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Set;

@RepositoryRestResource(collectionResourceRel = "books",path = "book-list")
@CrossOrigin("*")
public interface BookRepository extends JpaRepository<Book,Long> {

    @RestResource(path = "/categoryid")
    Page<Book> findByCategoryId(Long id, Pageable pageable);

    List<Book> findAllByNameIn(Set<String> names);
    @RestResource(path = "/searchbykeyword")

    Page<Book> findByNameContaining(@Param("name") String keyword, Pageable pageable);

}
