package com.greip.se.repository;

import com.greip.se.dto.SeRolDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "rol", path = "rol")
public interface SeRolRepository extends PagingAndSortingRepository<SeRolDto, Long> {

    @Query("select r from SeRolDto r where r.companiaDto.id = ?1")
    Page findByCompania(@Param("compania") Long idCompania, Pageable p);
}
