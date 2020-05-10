package com.book.online.repositories;

import com.book.online.entities.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@RepositoryRestResource(collectionResourceRel = "bookCategory",path = "book-category")
@CrossOrigin("*")
public interface BookCategoryRepository extends JpaRepository<BookCategory,Long> {

    List<BookCategory> findAllByCategoryNameIn(Set<String> categoryNames);

    //findByCategoryNameNotIn(Collection<> age);

}
