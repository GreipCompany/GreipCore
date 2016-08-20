package com.greip.se.repository;

import com.greip.se.dto.SeOpcionDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "opcion", path = "opcion")
public interface SeOpcionRepository extends CrudRepository<SeOpcionDto, Long> {

    @Query("select oprol from SeOpcionRolDto oprol where oprol.rolDto.id = ?1")
    List<SeOpcionDto> findByRol(@Param("rol") Long idRol);
}
