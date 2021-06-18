package ma.sii.workshop.monolith.mapping;

import ma.sii.workshop.monolith.domain.Person;
import ma.sii.workshop.monolith.dto.PersonDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper extends BaseMapper<Person, PersonDTO> {
}
